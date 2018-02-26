package com.company.first.additionalFunctions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;

import java.util.List;

public class SubTwoTheLongestSurname {

    public void showEmployeeWithTheLongestSurname(List<Employees>myList,String fileName) {

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        int count;
        int count1 = 0;

        for (Employees employees : readListOfEmployees) {
            count = employees.getSurname().length();
            if (count > count1) {
                count1 = count;
            }
        }
        for (Employees employees : readListOfEmployees) {
            if (employees.getSurname().length() == count1) {
                System.out.println("Below details for employee with the longest surname:\n"+employees);
            }
        }
    }
}
