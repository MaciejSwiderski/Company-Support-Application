package com.company.first.additionalFunctions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;

import java.util.List;

public class SubTwoAverageAgeWithKids {

    public void calculateAverageAge(List<Employees>myList,String fileName){

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        int averageAge=0;
        int amountOfEmployees=0;
        int add=1;

        for(Employees employees: readListOfEmployees){

            if(employees.getNumberOfChildren()>0){
                amountOfEmployees+=add;
                averageAge+=employees.getAge();
            }
        }
        int calculation = averageAge/amountOfEmployees;
        System.out.println("average age for employees with children is: "+calculation);
    }
}
