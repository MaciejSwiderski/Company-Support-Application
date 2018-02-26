package com.company.first.functions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MoneyRaiseTenPercent {

    public void addMoneyRaise(String fileName) throws IOException {

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        double tenPercent=0;
        double moneyAfterRaise = 0;
        double sumOfMoneyRaise=0;
        double twoDecimal=0;
        System.out.println("Add 10% of money raise to all employees y/n");
        Scanner scanner = new Scanner(System.in);
        String YesNot = scanner.next();
        if (YesNot.equalsIgnoreCase("y")) {
            for (Employees employees : readListOfEmployees) {
                 tenPercent= employees.getMoney() * 0.1;
                moneyAfterRaise = employees.getMoney() + tenPercent;
                employees.setMoney(moneyAfterRaise);
                double decimalTenPercent =Math.round(tenPercent/100)*100;
                System.out.println(employees.getName()+" "+employees.getSurname()+" : "+decimalTenPercent+" added");
                sumOfMoneyRaise+=decimalTenPercent;
                twoDecimal =Math.round(sumOfMoneyRaise/100)*100;
            } System.out.println("sum of money raise: "+twoDecimal);
        }

        System.out.println("do you want to save changes? y/n");
        String answer = scanner.next();
        ObjectMapper mapper= new ObjectMapper();
        if(answer.equalsIgnoreCase("y")) {
            mapper.writeValue(new File(fileName+".json"), readListOfEmployees);
        }
    }
}
