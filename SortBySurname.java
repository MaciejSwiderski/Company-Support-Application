package com.company.first.functions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;

import java.util.*;

public class SortBySurname {

    public void sortEmployeesBySurname(String fileName) {

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        System.out.println("Sorting by surname\nhow do you want to sort the list of Employees? true-ascending/false-descending");
        Scanner scanner = new Scanner(System.in);
        boolean howToSort = scanner.nextBoolean();

        if (howToSort == true) {
            Comparator<Employees> COMPARATOR_UP = new Comparator<Employees>() {
                public int compare(Employees e1, Employees e2) {
                    return e1.getSurname().compareTo(e2.getSurname());
                }
            };

            Collections.sort(readListOfEmployees, COMPARATOR_UP);
            for (Employees employees : readListOfEmployees) {
                System.out.println(employees);
            }
        } else {
            Comparator<Employees> COMPARATOR_DOWN = new Comparator<Employees>() {
                public int compare(Employees e1, Employees e2) {
                    return e2.getSurname().compareTo(e1.getSurname());
                }
            };
            Collections.sort(readListOfEmployees, COMPARATOR_DOWN);
            for (Employees employees : readListOfEmployees) {
                System.out.println(employees);
            }
        }
    }
}
