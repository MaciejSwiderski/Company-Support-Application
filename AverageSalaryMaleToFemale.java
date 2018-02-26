package com.company.first.functions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;

import java.util.List;

public class AverageSalaryMaleToFemale {

    public void calculateAverageSalaryMaleToFemale(String fileName) {

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        double maleMoney = 0;
        double femaleMoney = 0;
        int countMale = 0;
        int countHowManyM = 1;
        int countFemale = 0;
        int countHowManyF = 1;

        for (Employees employees : readListOfEmployees) {
            if (employees.getSex() == 'M') {
                countMale += countHowManyM;
                maleMoney += employees.getMoney();
            } else if (employees.getSex() == 'K') {
                countFemale += countHowManyF;
                femaleMoney += employees.getMoney();
            }
        }
        double countToFemale = femaleMoney/countFemale;
        double twoDecimalNumbersCountToFemale = Math.round(countToFemale * 10) / 10;
        double countToMale = maleMoney/countMale;
        double twoDecimalNumbersCountToMale = Math.round(countToMale * 10) / 10;

        double calculation = ((countToFemale) * 100) / countToMale;
        double twoDecimalNumbers = Math.round(calculation * 10) / 10;
        System.out.println("The ratio of the woman's average salary: " + twoDecimalNumbersCountToFemale +
                "\nto the man's average salary: " + twoDecimalNumbersCountToMale + " is: " + twoDecimalNumbers + " %");
    }
}
