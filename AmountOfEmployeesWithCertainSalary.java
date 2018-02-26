package com.company.first.functions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;

import java.io.IOException;
import java.util.List;

public class AmountOfEmployeesWithCertainSalary {

    public void calculateAmountOfEmployeesSalary(String fileName, double moneyToCheck) throws IOException {

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        int i = 1;
        int amountOfEmployees = 0;

        for (Employees employees : readListOfEmployees) {
            if (employees.getMoney() > moneyToCheck) {
                amountOfEmployees += i;
                System.out.println(employees.getName() + " " + employees.getSurname() + ":  " + employees.getMoney());
            }
        }
        System.out.println("there are: " + amountOfEmployees + " employee(s) with salary not below the amount you provided");
    }
}








