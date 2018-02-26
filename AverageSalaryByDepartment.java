package com.company.first.functions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;

import java.util.List;

public class AverageSalaryByDepartment {

    public void calculateAverageSalaryByDepartment(String fileName, int depNumber) {

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        double averageMoney = 0;
        int amountOfEmployees = 0;
        int i = 1;
        for (Employees employees : readListOfEmployees) {
            if (depNumber == employees.getDepartment()) {

                amountOfEmployees += i;
                averageMoney += employees.getMoney();
            }
        }
        System.out.println("The average salary in department: " + depNumber + " is " + averageMoney / amountOfEmployees);
    }
}
