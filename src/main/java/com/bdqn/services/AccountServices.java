package com.bdqn.services;

import com.bdqn.entity.Account;
import com.bdqn.entity.TransactionRecord;
import org.apache.ibatis.annotations.Param;

/**
 * Created by cai on 2018/3/10.
 */
public interface AccountServices {
    Account queryAllByCardNoAndPassword(@Param("cardNo") String cardNo, @Param("password") String password);

    int updateAccountByCardNoAndBalanceAndId( String  autId,String inId, TransactionRecord transactionRecord);

    Account queryAllByCardNo(String cardNo);

    int updateAccountByPasswordAndId(@Param("id") Integer id, @Param("password") String password);



}
