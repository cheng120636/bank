package com.bdqn.services;

import com.bdqn.dao.AccountMapper;
import com.bdqn.dao.TransactionRecordMapper;
import com.bdqn.entity.Account;
import com.bdqn.entity.TransactionRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cai on 2018/3/10.
 */
@Service("accountServices")
public class AccountServicesImpl implements AccountServices {
    @Resource
    private AccountMapper accountMapper;
    @Resource
    private TransactionRecordMapper transactionRecordMapper;

    /**
     * 登录
     * @param cardNo
     * @param password
     * @return
     */
    @Override
    public Account queryAllByCardNoAndPassword(String cardNo, String password) {
        return accountMapper.queryAllByCardNoAndPassword(cardNo,password);
    }


    /**
     * 转账
     * 增加记录
     * @param autId
     * @param inId
     * @param transactionRecord
     * @return
     */
    @Override
    public int updateAccountByCardNoAndBalanceAndId( String  autId, String  inId, TransactionRecord transactionRecord) {
        double transactionAmount = transactionRecord.getTransactionAmount();
        double autbalance = transactionRecord.getBalance();
        accountMapper.updateAccountByCardNoAndBalanceAndId(autbalance-transactionAmount, autId);
        double inbalance = accountMapper.queryAllById(inId).getBalance();
        accountMapper.updateAccountByCardNoAndBalanceAndId(inbalance+transactionAmount, inId);
        transactionRecord.setBalance(autbalance-transactionAmount);
        int n = transactionRecordMapper.addTransactionRecord(transactionRecord);
        Account account = accountMapper.queryAllById(inId);
        transactionRecord.setBalance(account.getBalance());
        transactionRecord.setTransactionAmount(transactionAmount);
        transactionRecord.setCardNo(account.getCardNo());
        int s = transactionRecordMapper.addTransactionRecord(transactionRecord);
        return s;
    }


    /**
     * 根据卡号获取数据
     * @param cardNo
     * @return
     */
    @Override
    public Account queryAllByCardNo(String cardNo) {
        return accountMapper.queryAllByCardNo(cardNo);
    }

    /**
     * 修改密码
     * @param id
     * @param password
     * @return
     */
    @Override
    public int updateAccountByPasswordAndId(Integer id, String password) {
        return accountMapper.updateAccountByPasswordAndId(id,password);
    }
}
