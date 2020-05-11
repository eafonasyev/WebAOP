package com.eafonasyev.springcourse.dao;

import org.springframework.stereotype.Component;

@Component
public class MemeberShipDao {

    public boolean addAccount(){
        System.out.println("we re adding membership account now");
        return true;
    }
}
