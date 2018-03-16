package com.bdqn.controller;

import com.bdqn.entity.Account;
import com.bdqn.entity.TransactionRecord;
import com.bdqn.services.AccountServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by cai on 2018/3/10.
 */
@Controller
@RequestMapping("account")
public class AccountController {
    @Resource
    private AccountServices accountServices;

    @RequestMapping(value = "transfer", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public String transfer(String  autId, String inId, TransactionRecord transactionRecord) {
        if (accountServices.queryAllByCardNo(transactionRecord.getCardNo())!=null){
            int n =accountServices.updateAccountByCardNoAndBalanceAndId(autId, inId, transactionRecord);
        }
        return "index";

    }


    @RequestMapping(value = "toaccount", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public String toAccount(String cardNo, String password, HttpSession session, Map map) {
        System.out.println(cardNo+"mima"+password);
        Account account = accountServices.queryAllByCardNo(cardNo);
        System.out.println(account);
        if (account!=null) {
            Account account1 = accountServices.queryAllByCardNoAndPassword(cardNo, password);
            if (account1!=null){
                if (account.getStatus()>0){
                    session.setAttribute("account",account);
                    return "Account";
                }
                map.put("msg","登录失败,帐号冻结");
                return "index";
            }
            map.put("msg", "登录失败,密码错误");
            return "index";
        }
        map.put("msg","登录失败,卡号不存在");
        return "index";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.removeAttribute("account");
        return "index";
    }
}
