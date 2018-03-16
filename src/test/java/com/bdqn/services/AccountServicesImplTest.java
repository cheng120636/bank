package com.bdqn.services;

import com.bdqn.dao.AccountMapper;
import com.bdqn.entity.TransactionRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by cai on 2018/3/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountServicesImplTest {

    @Test
    public void updateAccountByPasswordAndId1() throws Exception {
    }

    @Resource
    private AccountServices accountServices;
    @Resource
    private AccountMapper accountMapper;
    @Test
    public void queryAllByCardNoAndPassword() throws Exception {
    }

    @Test
    public void updateAccountByCardNoAndBalanceAndId() throws Exception {
        //int id, String cardNo, String transactionType, String remark, double transactionAmount, double balance, Date transactionDate
        TransactionRecord transactionRecord = new TransactionRecord();
        transactionRecord.setCardNo("1212121212121212");
        transactionRecord.setTransactionType("转账");
        transactionRecord.setTransactionAmount(20.00);
        transactionRecord.setBalance(accountMapper.queryAllById("1").getBalance());
        int n = accountServices.updateAccountByCardNoAndBalanceAndId("1","2",transactionRecord);
        System.out.println(n);


    }

    @Test
    public void queryAllByCardNo() throws Exception {
        System.out.println(accountServices.queryAllByCardNo("2222222222222222"));
    }

    @Test
    public void updateAccountByPasswordAndId() throws Exception {
    }

}