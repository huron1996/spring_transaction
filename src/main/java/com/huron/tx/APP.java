package com.huron.tx;

import com.huron.tx.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeans.xml");

        AccountService accountService = applicationContext.getBean("accountService",AccountService.class);

        accountService.transfer("Tom","Marry",100);
    }
}
