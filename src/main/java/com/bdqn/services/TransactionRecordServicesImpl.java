package com.bdqn.services;

import com.bdqn.dao.TransactionRecordMapper;
import com.bdqn.entity.TransactionRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by cai on 2018/3/10.
 */
@Service("transactionRecordServices")
public class TransactionRecordServicesImpl implements TransactionRecordServices {
    @Resource
    private TransactionRecordMapper transactionRecordMapper;
    @Override
    public int addTransactionRecord(TransactionRecord transactionRecord) {
        return transactionRecordMapper.addTransactionRecord(transactionRecord);
    }

    @Override
    public List<TransactionRecord> queryAllBytransactionDate(Date beginDate, Date endDate, String carNo) {
        return transactionRecordMapper.queryAllBytransactionDate(beginDate, endDate,carNo);
    }
}
