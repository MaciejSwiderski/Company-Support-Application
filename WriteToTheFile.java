package com.company.first.additionalFunctions;

import com.company.first.menu.Employees;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class WriteToTheFile {

    public List<Employees> toWriteDown(List<Employees> myList) throws IOException {

        Scanner scanner = new Scanner(System.in);
        ObjectMapper mapper= new ObjectMapper();
        System.out.println("Type a name of file you want to export employees details to ");
        String destination =scanner.next();

        mapper.writeValue(new File(destination+".json"), myList);
        String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myList);
        System.out.println(jsonInString);

        return myList;
    }
}
