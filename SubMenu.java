package com.company.first.functions;

import java.io.IOException;
import java.util.Scanner;

public class SubMenu {

    public void subMenuFunctionality(String fileName) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the sub-menu system!\n" +

                "1.Show amount of employee with salary above provided\n" +
                "2.Average salary by department provided\n" +
                "3.The highest salary among males and females\n" +
                "4.% of average salary male to female\n" +
                "5.Add 10% of raise or provide amount.\n" +
                "6.Add certain amount of money raise\n" +
                "7.Sort all Employees.\n" +
                "8.Sort according to the salary\n" +
                "9.Exit"
        );
        int number = scanner.nextInt();

        switch (number) {

            case 1:
                AmountOfEmployeesWithCertainSalary amountOfEmployeesWithCertainSalary = new AmountOfEmployeesWithCertainSalary();
                System.out.println("provide money");
                double moneyToCheck = scanner.nextDouble();
                amountOfEmployeesWithCertainSalary.calculateAmountOfEmployeesSalary(fileName, moneyToCheck);
                subMenuFunctionality(fileName);
                break;
            case 2:
                AverageSalaryByDepartment averageSalaryByDepartment = new AverageSalaryByDepartment();
                System.out.println("Provide a department number:");
                int depNumber = scanner.nextInt();
                averageSalaryByDepartment.calculateAverageSalaryByDepartment(fileName, depNumber);
                subMenuFunctionality(fileName);
                break;
            case 3:
                HighestSalary highestSalary = new HighestSalary();
                highestSalary.calculateTheHighestSalary(fileName);
                subMenuFunctionality(fileName);
                break;
            case 4:
                AverageSalaryMaleToFemale averageSalaryMaleToFemale = new AverageSalaryMaleToFemale();
                averageSalaryMaleToFemale.calculateAverageSalaryMaleToFemale(fileName);
                subMenuFunctionality(fileName);
                break;
            case 5:
                MoneyRaiseTenPercent moneyRaiseTenPercent = new MoneyRaiseTenPercent();
                moneyRaiseTenPercent.addMoneyRaise(fileName);
                subMenuFunctionality(fileName);
                break;
            case 6:
                MoneyRaiseAmountFromUser moneyRaiseAmountFromUser = new MoneyRaiseAmountFromUser();
                moneyRaiseAmountFromUser.calculateMoneyRaiseFromUser(fileName);
                MoneyRaiseAmountFromUserForEeach moneyRaiseAmountFromUserForEeach = new MoneyRaiseAmountFromUserForEeach();
                moneyRaiseAmountFromUserForEeach.addMoneyRaiseForEeachOfEmployees(fileName);
                subMenuFunctionality(fileName);
                break;
            case 7:
                SortBySurname sortBySurname = new SortBySurname();
                sortBySurname.sortEmployeesBySurname(fileName);
                subMenuFunctionality(fileName);
                break;
            case 8:
                SortBySalary sortBySalary = new SortBySalary();
                sortBySalary.sortEmployeesBySalary(fileName);
                subMenuFunctionality(fileName);
                break;
            case 9:
                break;
            default:
                System.out.println("You have not chosen any number");
                break;
        }
    }
}
