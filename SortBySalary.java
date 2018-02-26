package com.company.first.functions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;

import java.util.*;

public class SortBySalary {

    public void sortEmployeesBySalary(String fileName) {

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        System.out.println("Sorting by salary\nhow do you want to sort the list of Employees? true-ascending/false-descending");
        Scanner scanner = new Scanner(System.in);
        boolean howToSort = scanner.nextBoolean();

        if (howToSort == true) {
            Comparator<Employees> COMPARATOR_UP = new Comparator<Employees>() {
                public int compare(Employees e1, Employees e2) {
                    return (int) (e1.getMoney() - (e2.getMoney()));
                }
            };

            Collections.sort(readListOfEmployees, COMPARATOR_UP);
            for (Employees employees : readListOfEmployees) {
                System.out.println(employees);
            }
        } else {
            Comparator<Employees> COMPARATOR_DOWN = new Comparator<Employees>() {
                public int compare(Employees e1, Employees e2) {
                    return (int) (e2.getMoney() - (e1.getMoney()));
                }
            };
            Collections.sort(readListOfEmployees, COMPARATOR_DOWN);
            for (Employees employees : readListOfEmployees) {
                System.out.println(employees);
            }
        }
    }
}
