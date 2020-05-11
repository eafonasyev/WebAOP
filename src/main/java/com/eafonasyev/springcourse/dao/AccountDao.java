package com.eafonasyev.springcourse.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDao {

    private String name;

    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void addAccount(Account account, boolean flag){
        System.out.println("we re adding account now");
    }
    public List<Account> findAccounts(){
        List<Account> accounts = new ArrayList<>();
        Account account1 = new Account("JHorry",2);
        Account account2 = new Account("Djohb",5);
        Account account3 = new Account("Alf",7);
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        System.out.println("same retur77777");
        return accounts;
    }
}
