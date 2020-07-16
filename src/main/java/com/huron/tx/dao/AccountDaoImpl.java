package com.huron.tx.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void out(String outer, int money) {
        this.getJdbcTemplate().update("update account set money = money-? where username=?",money,outer);
    }

    @Override
    public void in(String inner, int money) {
        this.getJdbcTemplate().update("update account set money = money + ? where username = ?",money,inner);
    }
}
