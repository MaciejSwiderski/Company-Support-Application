package com.company.first.menu;

import com.company.first.menu.Employees;

import java.util.List;
import java.util.Scanner;

public class Remove {

    public List<Employees> removeTheEmployee(List<Employees> myList) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println(myList.toString());
        System.out.println("provide a name you want to remove: ");
        String nameGiven = scanner.nextLine();
        System.out.println("and surname : ");
        String surnameGiven = scanner.nextLine();
        for (int i=0;i<myList.size();i++) {
            if ((myList.get(i).getName().equalsIgnoreCase(nameGiven))&&(myList.get(i).getSurname().equalsIgnoreCase(surnameGiven))) {
                myList.remove(myList.get(i));
            }
        }
        return myList;
    }
}
