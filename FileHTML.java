package com.company.first.additionalFunctions;

import com.company.first.menu.ReadTheFile;
import com.company.first.menu.Employees;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileHTML {

    public void createHTMLFile(List<Employees> myList,String fileName) throws IOException {

        System.out.println("provide a name of file you want to make a HTML file from:");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        if(answer.equalsIgnoreCase("base")){
            fileName=fileName;
        }else{
            fileName=answer;
        }
        ReadTheFile readTheFile = new ReadTheFile();
        List<Employees>readListOfEmployees= readTheFile.readTheFileFromJson(fileName);

        System.out.println("provide a name of HTML file you want to create");
        String htmlFileName = scanner.next();
        PrintWriter pw = new PrintWriter(new FileWriter(htmlFileName+".html"));

         pw.println("<head>\n" +
                "    <style>\n" +
                "                table, th, td {\n" +
                "            border: 1px solid black;\n" +
                "            border-collapse: collapse;\n" +
                "        }\n" +
                "        th, td {\n" +
                "            padding: 10px;\n" +
                "        }\n" +
                "        body{background-color: grey;}"+
                "</style>");
        pw.println("<body>");
        pw.println("<img src =\"http://smslaw.com.au/wp-content/uploads/2014/07/employee.jpg\" alt=\"employees\" width=\"555\n" +
                "\">");
        pw.println("<TABLE bgcolor=#D3D3D3");
        pw.println("<TABLE BORDER><TR><TH>nb<TH>Name<TH>Surname<TH>Sex<TH>Department<TH>Salary<TH>Age</TR>");
        pw.println("<h1> All Employees</h1>");
        int i=0;
        for (Employees employees:readListOfEmployees) {
            i=i+1;
            pw.println("<TR><TD>"+i+"<TD>"+ employees.getName() + "<TD>" + employees.getSurname()+
                    "<TD>"+employees.getSex()+"<TD>"+employees.getDepartment()+
                    "<TD>"+employees.getMoney()+"<TD>"+employees.getAge());
        }
        pw.println("</TABLE>");
        pw.println("</body>");
        pw.close();
        System.out.println("HTML file called "+htmlFileName +" has been created");
    }
}

