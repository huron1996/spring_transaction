package com.huron.tx.dao;

public interface AccountDao {
    //汇款
    public void out(String outer, int money);


    //收款
    public void in(String inner, int money);
}

