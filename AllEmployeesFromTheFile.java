package com.company.first.menu;

import com.company.first.additionalFunctions.WriteToTheFile;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class AllEmployeesFromTheFile {

    public void showAllFromTheFile() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a file name you want to see: ");
        String fileName = scanner.next();

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        WriteToTheFile writeToTheFile = new WriteToTheFile();
        System.out.println("choose what you want to do withe the employees's file:\n" +
                "1.Add an employee\n" +
                "2.Remove an employee\n" +
                "3.Edit an employee\n" +
                "4.Exit\n");
        int number = scanner.nextInt();
        switch (number) {

            case 1:
                AddNewEmployee(scanner, readListOfEmployees);
                writeToTheFile.toWriteDown(readListOfEmployees);
                showAllFromTheFile();
                break;
            case 2:
                removeAnEmployee(scanner, readListOfEmployees);
                writeToTheFile.toWriteDown(readListOfEmployees);
                showAllFromTheFile();
                break;
            case 3:
                editAnEmployee(scanner, readListOfEmployees);
                writeToTheFile.toWriteDown(readListOfEmployees);
                showAllFromTheFile();
                break;
            case 4:
                System.out.println("Bye");
                break;
            default:
                System.out.println("you have not chosen any activity");
        }
    }
    private void editAnEmployee(Scanner scanner, List<Employees> readListOfEmployees) {
        String answerToEdit;
        do {
            System.out.println("Do you want to edit an employee from the file? y/n");
            answerToEdit = scanner.next();
            if (answerToEdit.equalsIgnoreCase("y")) {
                Edit edit = new Edit();
                edit.myEditList(readListOfEmployees);
            }
        } while (answerToEdit.equalsIgnoreCase("y"));
    }

    private void removeAnEmployee(Scanner scanner, List<Employees> readListOfEmployees) throws InterruptedException {
        String answerToRemove;
        do {
            System.out.println("Do you want to remove an employee from the file? y/n");
            answerToRemove = scanner.next();
            if (answerToRemove.equalsIgnoreCase("y")) {
                Remove remove = new Remove();
                remove.removeTheEmployee(readListOfEmployees);
            }
        } while (answerToRemove.equalsIgnoreCase("y"));
    }

    private void AddNewEmployee(Scanner scanner, List<Employees> readListOfEmployees) {
        String answerToAdd;
        do {
            System.out.println("Do you want to add an employee to the file? y/n");
            answerToAdd = scanner.next();
            if (answerToAdd.equalsIgnoreCase("y")) {
                AddEmployee addEmployee = new AddEmployee();
                addEmployee.adding(readListOfEmployees);
            }
        } while (answerToAdd.equalsIgnoreCase("y"));
    }
}
