package com.bdqn.dao;

import com.bdqn.entity.TransactionRecord;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by cai on 2018/3/10.
 */
public interface TransactionRecordMapper {
    int addTransactionRecord(TransactionRecord transactionRecord);

    List<TransactionRecord> queryAllBytransactionDate(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate, @Param("carNo")String carNo);
}
