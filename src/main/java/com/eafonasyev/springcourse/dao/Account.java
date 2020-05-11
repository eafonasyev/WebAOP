package com.eafonasyev.springcourse.dao;

public class Account {

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

    public Account(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
