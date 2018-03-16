package com.bdqn.services;

import com.bdqn.entity.TransactionRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by cai on 2018/3/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TransactionRecordServicesImplTest {
    @Resource
    private TransactionRecordServices transactionRecordServices;
    @Test
    public void queryAllBytransactionDate() throws Exception {

        List<TransactionRecord> list = transactionRecordServices.queryAllBytransactionDate(
                new SimpleDateFormat("yyyy-MM-dd").parse("2018-03-9"),
                new SimpleDateFormat("yyyy-MM-dd").parse("2018-03-14"),
                "123");


        if (list != null) {
            for (Object o : list) {
                System.out.println(o);
            }
        }
    }

    @Test
    public void test1() throws ParseException {
        TransactionRecord transactionRecord = new TransactionRecord();
        transactionRecord.setTransactionDate(new Date(2018-03-13));
        Date date = new Date("2018-03-13");
//        Date date1 = new SimpleDateFormat("YYYY-MM-dd").format(date);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd").format(new Date("2018-03-13"));
//        System.out.println(transactionRecord.getTransactionDate());
        System.out.println(date);
    }


}