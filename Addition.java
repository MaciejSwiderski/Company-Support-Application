package com.company.first.menu;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Addition {

    public void overrideTheNameOfFile(List<Employees> myList, String fileName) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees> readListOfEmployees = readTheFile.readTheFileFromJson(fileName);

        String newFile = fileName + ".json";
        System.out.println("While saving do you want to change the name of the file? y/n");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            System.out.println("provide new name of the file");
            String newnameOfFile = scanner.nextLine();
            if (newnameOfFile != null) {
                newFile = newnameOfFile + ".json";
            }
            mapper.writeValue(new File(newFile), readListOfEmployees);
        } else {
            mapper.writeValue(new File(newFile), readListOfEmployees);
        }
    }
}
