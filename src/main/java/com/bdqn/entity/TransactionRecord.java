package com.bdqn.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by cai on 2018/3/10.
 */
public class TransactionRecord {
    /*
    id              int(11) NOT NULL使用自增赋值
cardNo              varchar(16) NOT NULL对应account表cardno字段
transactionType     varchar(2) NOT NULL存款,取款
remark              varchar(100) NULL交易的备注
transactionDate     datetime NOT NULL取系统时间
transactionAmount   double(10,2) NOT NULL2位小数
balance             double(10,2) NOT NULL2位小数
     */
    private int id;
    private String cardNo,transactionType,remark;
    private double transactionAmount,balance;
    @JSONField(format = "YYYY-MM-dd hh:mm:ss")
    private Date transactionDate;


    @Override
    public String toString() {
        return "TransactionRecord{" +
                "id=" + id +
                ", cardNo='" + cardNo + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", remark='" + remark + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", balance=" + balance +
                ", transactionDate=" + transactionDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public TransactionRecord(int id, String cardNo, String transactionType, String remark, double transactionAmount, double balance, Date transactionDate) {

        this.id = id;
        this.cardNo = cardNo;
        this.transactionType = transactionType;
        this.remark = remark;
        this.transactionAmount = transactionAmount;
        this.balance = balance;
        this.transactionDate = transactionDate;
    }

    public TransactionRecord() {

    }
}
