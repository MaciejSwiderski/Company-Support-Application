package com.company.first.menu;

import com.company.first.menu.Employees;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTheFile {

    public List<Employees> readTheFileFromJson(String fileName){
        ObjectMapper mapper = new ObjectMapper();
        List<Employees> readListOfEmployees = new ArrayList<>();

        try {
            readListOfEmployees = mapper.readValue(new File(fileName + ".json"), new TypeReference<List<Employees>>() {
            });

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readListOfEmployees;
    }
}
