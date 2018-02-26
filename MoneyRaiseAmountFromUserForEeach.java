package com.company.first.functions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MoneyRaiseAmountFromUserForEeach {

    public void addMoneyRaiseForEeachOfEmployees(String fileName) throws IOException {

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        double totalRaiseM = 0;
        double totalRaiseF = 0;
        double amountOfRaiseM;
        double amountOfRaiseF;
        double totalRaiseForMaleAndFemale = 0;

        String addMoreMoneyRaise;
        Scanner scanner;
        do {

            System.out.println("Do you want to add money raise to certain employee y/n");
            scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Who do you want to add a money raise to\nprovide name: ");
                String name = scanner.next();
                System.out.println("provide surname:");
                String surname = scanner.next();

                for (Employees employees : readListOfEmployees) {

                    if ((employees.getName().equalsIgnoreCase(name)) && (employees.getSurname().equalsIgnoreCase(surname)) && (employees.getSex() == 'M')) {
                        System.out.println("how much of money raise you want to add? ");
                        amountOfRaiseM = scanner.nextDouble();
                        employees.setMoney(employees.getMoney() + amountOfRaiseM);
                        totalRaiseM += amountOfRaiseM;

                    } else if ((employees.getName().equalsIgnoreCase(name)) && (employees.getSurname().equalsIgnoreCase(surname)) && (employees.getSex() == 'K')) {
                        System.out.println("how much of money raise you want to add? ");
                        amountOfRaiseF = scanner.nextDouble();
                        employees.setMoney(employees.getMoney() + amountOfRaiseF);
                        totalRaiseF += amountOfRaiseF;
                    }
                    totalRaiseForMaleAndFemale = totalRaiseM + totalRaiseF;
                }
                System.out.println("total raise for all employees: " + totalRaiseForMaleAndFemale);
            }
            System.out.println("do you want to add more ? y/n");
            addMoreMoneyRaise = scanner.next();

        } while (addMoreMoneyRaise.equalsIgnoreCase("y"));

        double calculation = ((totalRaiseF) * 100) / (totalRaiseM);
        double twoDecimalNumbersRaise = Math.round(calculation * 10) / 10;
        System.out.println("The ratio of the woman's average money raise which is : " + totalRaiseF +
                "\nto the man's average money raise which is: " + totalRaiseM + " is: " + twoDecimalNumbersRaise + " %");

        System.out.println("do you want to save changes? y/n");
        String confirm = scanner.next();
        ObjectMapper mapper = new ObjectMapper();
        if (confirm.equalsIgnoreCase("y")) {
            mapper.writeValue(new File(fileName+".json"), readListOfEmployees);
        }
    }
}
