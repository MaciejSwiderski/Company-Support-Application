package com.company.first.additionalFunctions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileFeatures {

    public void additionalFilesFunctionality(List<Employees> myList, String fileN) throws IOException, InterruptedException {

        ObjectMapper mapper = new ObjectMapper();

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileN);

        File file = new File(fileN + ".json");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        mapper = new ObjectMapper();
        System.out.println("do you want to write current list down to the json file and replace current base file n/y");
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("n")) {
            mapper.writeValue(file, readListOfEmployees);
        } else {
            mapper.writeValue(file, myList);
        }
    }
    public void subMenuTwo(List<Employees> myList, String fileN) throws IOException {

        String fileName = fileN;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the sub-menu system!\n" +

                "1.Show details for employee with the longest surname\n" +
                "2.Show average age for employees with children\n" +
                "3.Employee with the salary below average\n" +
                "4.Create html file\n" +
                "5.Exit"
        );

        int number = scanner.nextInt();

        switch (number) {

            case 1:
                SubTwoTheLongestSurname subTwoTheLongestSurname = new SubTwoTheLongestSurname();
                subTwoTheLongestSurname.showEmployeeWithTheLongestSurname(myList, fileName);
                subMenuTwo(myList, fileN);
                break;
            case 2:
                SubTwoAverageAgeWithKids subTwoAverageAgeWithKids = new SubTwoAverageAgeWithKids();
                subTwoAverageAgeWithKids.calculateAverageAge(myList, fileName);
                subMenuTwo(myList, fileN);
                break;
            case 3:
                SubTwoEployeesTheLowestSalary subTwoEployeesTheLowestSalary = new SubTwoEployeesTheLowestSalary();
                subTwoEployeesTheLowestSalary.showEmployeeWithTheLowestSalary(myList, fileName);
                subMenuTwo(myList, fileN);
                break;
            case 4:
                FileHTML fileHTML = new FileHTML();
                fileHTML.createHTMLFile(myList, fileName);
                subMenuTwo(myList, fileN);
                break;
            case 5:
                System.out.println("You exited from the sub menu");
                break;
            default:
                System.out.println("You have not chosen any number");
                break;
        }
    }
}


