package com.company.first.menu;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddEmployee {

    String name;
    String surname;
    int children;
    char sex;
    int depart;
    int age;
    boolean status;
    double money;

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

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getDepart() {
        return depart;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Employees adding(List<Employees> myList) {
        Scanner scanner = new Scanner(System.in);

        Employees employeesAdd = new Employees();

        System.out.println("provide details: ");
        System.out.println("name:");
        name = scanner.next();
        employeesAdd.setName(name);
        System.out.println("surnamename:");
        surname = scanner.next();
        employeesAdd.setSurname(surname);
        System.out.println("sex: K/M");
        sex = scanner.next(".").charAt(0);
        employeesAdd.setSex(sex);
        System.out.println("age:");
        age = scanner.nextInt();
        employeesAdd.setAge(age);
        System.out.println("money:");
        money = scanner.nextDouble();
        employeesAdd.setMoney(money);
        System.out.println("how many children:");
        children = scanner.nextInt();
        employeesAdd.setNumberOfChildren(children);
        System.out.println("martial status: true/false");
        status = scanner.nextBoolean();
        employeesAdd.setMaritalStatus(status);
        System.out.println("department: number");
        depart = scanner.nextInt();
        employeesAdd.setDepartment(depart);

        calculateMoneyRaiseForAddingPerson();
        employeesAdd.setMoney(getMoney());
        myList.add(employeesAdd);

        return employeesAdd;
    }

    public void calculateMoneyRaiseForAddingPerson() {

        if ((getChildren() > 0) && (isStatus() == true))
            setMoney( getMoney() +( getMoney() * getChildren() * 0.02 + (getMoney() * 0.03)));
        else if (isStatus() == true)
           setMoney( getMoney() +(getMoney() * 0.03));
        else if (getChildren() > 0)
            setMoney(getMoney() +( getMoney() * 0.02));
        else
            setMoney(getMoney());
    }
}
