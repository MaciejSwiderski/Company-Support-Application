package com.company.first.menu;

import com.company.first.additionalFunctions.FileFeatures;
import com.company.first.additionalFunctions.WriteToTheFile;
import com.company.first.functions.SubMenu;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void myMenu(List<Employees> myList) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the ERP system!\n" +

                "1.Show all the employees(List)\n" +
                "2.Add new employee(List)\n" +
                "3.Export (List) to the Eployees file\n" +
                "4.Remove an employee\n" +
                "5.Edit Eployee's details\n" +
                "6.Move to sub-menu 1...\n" +
                "7.Data export and move to  sub-menu 2..\n" +
                "8.System information\n" +
                "9.Additional features - changing name of file\n" +
                "10.Employees from the file(Add/Remove/Edit)\n" +
                "0.Exit"
        );
        int number = scanner.nextInt();

        switch (number) {

            case 1:
                for (Employees e : myList) {
                    System.out.println(e.shortDisplay());
                }
                myMenu(myList);
                break;
            case 2:
                AddEmployee addEmployee = new AddEmployee();
                addEmployee.adding(myList);
                System.out.println(myList.toString());
                myMenu(myList);
                break;
            case 3:
                WriteToTheFile writeToTheFile = new WriteToTheFile();
                writeToTheFile.toWriteDown(myList);
                myMenu(myList);
                break;
            case 4:
                Remove remove = new Remove();
                remove.removeTheEmployee(myList);
                System.out.println(myList.toString());
                myMenu(myList);
                break;
            case 5:
                Edit edit = new Edit();
                edit.myEditList(myList);
                myMenu(myList);
                break;
            case 6:
                SubMenu subMenu = new SubMenu();
                System.out.println("provide a name of file you want to work with: \n");
                String fileName = scanner.next();
                subMenu.subMenuFunctionality(fileName);
                myMenu(myList);
                break;
            case 7:
                FileFeatures fileFeatures = new FileFeatures();
                System.out.println("provide a name of file you want to work with: \n");
                String fileN = scanner.next();
                fileFeatures.additionalFilesFunctionality(myList, fileN);
                fileFeatures.subMenuTwo(myList, fileN);
                myMenu(myList);
                break;
            case 8:
                System.out.println("This is a Company Support Sofware System called CSSS\n" +
                        "Created by Maciej Swiderski\nLast update: 17.02.2017 ");
                myMenu(myList);
                break;
            case 9:
                Addition addition = new Addition();
                String fileName1 = "base";
                addition.overrideTheNameOfFile(myList, fileName1);
                myMenu(myList);
                break;
            case 10:
                AllEmployeesFromTheFile allEmployeesFromTheFile = new AllEmployeesFromTheFile();
                allEmployeesFromTheFile.showAllFromTheFile();
                myMenu(myList);
                break;
            case 0:
                System.out.println("Good bye");
                break;
            default:
                System.out.println("you have not chosen any number");
                break;
        }
    }
}
