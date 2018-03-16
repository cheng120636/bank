package com.bdqn.dao;

import com.bdqn.entity.Account;
import org.apache.ibatis.annotations.Param;

/**
 * Created by cai on 2018/3/10.
 */
public interface AccountMapper {
    Account queryAllByCardNoAndPassword(@Param("cardNo") String cardNo, @Param("password") String password);

    int updateAccountByCardNoAndBalanceAndId(@Param("balance") double balance, @Param("id") String  id);

    Account queryAllByCardNo(String cardNo);

    int updateAccountByPasswordAndId(@Param("id") Integer id, @Param("password") String password);

    Account queryAllById(String  id);
}
