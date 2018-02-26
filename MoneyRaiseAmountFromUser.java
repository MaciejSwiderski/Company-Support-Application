package com.company.first.functions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MoneyRaiseAmountFromUser {

    public double calculateMoneyRaiseFromUser(String fileName) throws IOException {

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        double totalRaise=0;
        double amountOfRaise;

        double totalRaiseMale=0;
        double totalRaiseFemale=0;

        System.out.println("Add  certain amount of money raise to all employees y/n");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("y")){
            System.out.println("how much money you want to raise salary for? ");
            amountOfRaise = scanner.nextDouble();
            for(Employees employees:readListOfEmployees){
                employees.setMoney(employees.getMoney()+amountOfRaise);
                totalRaise+=amountOfRaise;
                if(employees.getSex()=='M'){
                    totalRaiseMale+=amountOfRaise;
                }else if(employees.getSex()=='K'){
                    totalRaiseFemale+=amountOfRaise;
                }
            }System.out.println("total raise for all employees: "+totalRaise);
        }

        double calculation = ((totalRaiseFemale)*100)/(totalRaiseMale);
        double twoDecimalNumbersRaise = Math.round(calculation*10)/10;
        System.out.println("The ratio of the woman's average money raise which is : "+totalRaiseFemale+
                "\nto the man's average money raise which is: "+totalRaiseMale+" is: "+twoDecimalNumbersRaise+" %");

        System.out.println("do you want to save changes? y/n");
        String confirm = scanner.next();
        ObjectMapper mapper=new ObjectMapper();
        if(confirm.equalsIgnoreCase("y")) {
            mapper.writeValue(new File(fileName+".json"), readListOfEmployees);
        }
        return twoDecimalNumbersRaise;
    }
}
