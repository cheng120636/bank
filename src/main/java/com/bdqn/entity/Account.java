package com.bdqn.entity;

/**
 * Created by cai on 2018/3/10.
 */
public class Account {
    /*
    id          int(11) NOT NULL使用自增赋值
cardNo          varchar(16) NOT NULL16位数字卡号
password        varchar(6) NOT NULL6位数字密码
balance         double(10,2) NOT NULL2位小数
status          int(1) NOT NULL1为正常,0为冻结
     */
    private int id,status;
    private String cardNo,password;
    private double balance;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", status=" + status +
                ", cardNo='" + cardNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(int id, int status, String cardNo, String password, double balance) {

        this.id = id;
        this.status = status;
        this.cardNo = cardNo;
        this.password = password;
        this.balance = balance;
    }

    public Account() {

    }
}
