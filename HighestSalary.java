package com.company.first.functions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;

import java.util.List;

public class HighestSalary {

    public void calculateTheHighestSalary(String fileName) {

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        double maxMale = 0;
        double maxFemale = 0;
        String surNameMale=null;
        String surNameFemale=null;
        String nameMale=null;
        String nameFemale=null;

        for (Employees employees : readListOfEmployees) {
            if ((employees.getSex() == 'M') && (employees.getMoney() > maxMale)) {
                maxMale = employees.getMoney();
                surNameMale=employees.getSurname();
                nameMale=employees.getName();
            }
            if ((employees.getSex() == 'K') && (employees.getMoney() > maxFemale)) {
                maxFemale = employees.getMoney();
                surNameFemale=employees.getSurname();
                nameFemale=employees.getName();
            }
        }
        System.out.println("the highest male's salary is: " + maxMale+" : "+nameMale+" "+surNameMale);
        System.out.println("the highest female's salary is: " + maxFemale +" : "+nameFemale+" "+surNameFemale);
    }
}

