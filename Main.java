package com.company.first;

import com.company.first.menu.Employees;
import com.company.first.menu.Menu;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Employees employees1 = new Employees();
        employees1.setName("Maciej");
        employees1.setSurname("Swiderski");
        employees1.setSex('M');
        employees1.setMoney(8000);
        employees1.setMaritalStatus(true);
        employees1.setNumberOfChildren(1);
        employees1.setDepartment(3);
        employees1.setAge(30);
        employees1.calculateMoneyRaise();

        Employees employees2 = new Employees();
        employees2.setName("Dorota");
        employees2.setSurname("Kowalska");
        employees2.setSex('K');
        employees2.setMoney(8000);
        employees2.setMaritalStatus(true);
        employees2.setNumberOfChildren(3);
        employees2.setDepartment(3);
        employees2.setAge(30);
        employees2.calculateMoneyRaise();

        Employees employees3 = new Employees();
        employees3.setName("Kasia");
        employees3.setSurname("Torczyk");
        employees3.setSex('K');
        employees3.setMoney(4000);
        employees3.setMaritalStatus(true);
        employees3.setNumberOfChildren(0);
        employees3.setDepartment(1);
        employees3.setAge(35);
        employees3.calculateMoneyRaise();

        Employees employees4 = new Employees();
        employees4.setName("Arek");
        employees4.setSurname("Brodzinski");
        employees4.setSex('M');
        employees4.setMoney(8000);
        employees4.setMaritalStatus(true);
        employees4.setNumberOfChildren(1);
        employees4.setDepartment(1);
        employees4.setAge(38);
        employees4.calculateMoneyRaise();

        List<Employees> myList = new ArrayList<>();

        myList.add(employees1);
        myList.add(employees2);
        myList.add(employees3);
        myList.add(employees4);

        Menu menu = new Menu();
        menu.myMenu(myList);
    }
}
