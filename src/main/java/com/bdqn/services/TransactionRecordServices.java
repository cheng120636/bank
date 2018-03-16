package com.bdqn.services;

import com.bdqn.entity.TransactionRecord;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by cai on 2018/3/10.
 */
public interface TransactionRecordServices {
    int addTransactionRecord(TransactionRecord transactionRecord);

    List<TransactionRecord> queryAllBytransactionDate(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate, String carNo);
}
