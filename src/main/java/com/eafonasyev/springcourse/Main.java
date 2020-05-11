package com.eafonasyev.springcourse;

import com.eafonasyev.springcourse.dao.Account;
import com.eafonasyev.springcourse.dao.AccountDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        AccountDao dao = context.getBean("accountDao",AccountDao.class);
        System.out.println("------------------------------------------------------------");
        List<Account> accounts = dao.findAccounts();
        System.out.println(accounts);
        context.close();
    }
}
