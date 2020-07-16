package com.huron.tx.service;

public interface AccountService {
    //Service层
    //转账
    public void transfer(String outer,String inner,int money);
}
