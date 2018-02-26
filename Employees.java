package com.company.first.menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Employees {

    private String name;
    private String surname;
    private char sex;
    private int department;
    private double money;
    private double moneyAndRaise;
    private int age;
    private int numberOfChildren;
    private boolean maritalStatus;

    public double getMoneyAndRaise() {
        return moneyAndRaise;
    }

    public void setMoneyAndRaise(double moneyAndRaise) {
        this.moneyAndRaise = moneyAndRaise;
    }

    public Employees() {

    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", department=" + department +
                ", money=" + money +
                ", age=" + age +
                ", numberOfChildren=" + numberOfChildren +
                ", maritalStatus=" + maritalStatus +
                '}';
    }

    public String shortDisplay() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department +
                ", money=" + money + '\'' +
                '}';
    }

    public String specialDisplay() {
        return "Employees{" +
                "name='" + name.toUpperCase() + '\'' +
                ", surname='" + surname.toUpperCase() + '\'' +
                '}';
    }

    public double calculateMoneyRaise() {


        if ((numberOfChildren > 0) && (maritalStatus == true))
            return money += money * numberOfChildren * 0.02 + (money * 0.03);
        else if (maritalStatus == true)
            return money += money * 0.03;
        else if (numberOfChildren > 0)
            return money += money * 0.02;
        else
            return money;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}


