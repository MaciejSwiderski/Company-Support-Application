package com.company.first.additionalFunctions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;

import java.util.List;

public class SubTwoEployeesTheLowestSalary {

    public void showEmployeeWithTheLowestSalary(List<Employees>myList,String fileName) {

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        double salary = 0;
        int amountOfEmployees = 0;
        int add = 1;

        for (Employees employees : readListOfEmployees) {
            salary += employees.getMoney();
            amountOfEmployees += add;
        }
        double averageSalary = salary / amountOfEmployees;
        double average2Decimal= Math.round(averageSalary)*10/10;
        System.out.println("The average salary is: " + average2Decimal);

        for (Employees employees : readListOfEmployees) {
            if (employees.getMoney() < averageSalary) {
                employees.setSurname(employees.getSurname().charAt(0) + "*******" + employees.getSurname().charAt(employees.getSurname().length() - 1));
                System.out.println(employees);
            }
        }
    }
}
