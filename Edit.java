package com.company.first.menu;

import java.util.List;
import java.util.Scanner;

public class Edit {

    private String newName;
    private String newSurname;

    public String getNewSurname() {
        return newSurname;
    }

    public void setNewSurname(String newSurname) {
        this.newSurname = newSurname;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public void myEditList(List<Employees> myList) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(myList.toString());
        System.out.println("type a name");
        String name = scanner.next();
        System.out.println("type a surname");
        String surname = scanner.next();

        for (int j = 0; j < myList.size(); j++) {
            if ((myList.get(j).getName().equalsIgnoreCase(name) && (myList.get(j).getSurname().equalsIgnoreCase(surname)))) {
                System.out.println(myList.get(j).specialDisplay());
            }
        }

        int number = 0;
        while (number != 8) {
            System.out.println("\nChoose to edit:\n" +
                    "1.Name\n" +
                    "2.Surname\n" +
                    "3.Number of Kids\n" +
                    "4.Department\n" +
                    "5.Money\n" +
                    "6.Martial status\n" +
                    "7.Age\n" +
                    "8.Sex\n"+
                    "9.Exit");

            number = scanner.nextInt();
            switch (number) {

                case 1:
                    System.out.println("provide a new name: ");
                    newName = scanner.next();
                    for (int i = 0; i < myList.size(); i++) {
                        if (((myList.get(i).getName().equalsIgnoreCase(name)))
                                && (myList.get(i).getSurname().equalsIgnoreCase(surname))) {
                            myList.get(i).setName(newName);
                            System.out.println(myList.get(i).toString());
                        }
                    }
                    break;

                case 2:
                    System.out.println("provide a new surname: ");
                    newSurname = scanner.next();
                    for (int i = 0; i < myList.size(); i++) {
                        if (myList.get(i).getSex() == 'M') {
                            System.out.println("you can not change A male surname");

                        } else if (((myList.get(i).getName().equalsIgnoreCase(name))
                                || (myList.get(i).getName().equalsIgnoreCase(getNewName())
                                && (myList.get(i).getSurname().equalsIgnoreCase(surname))
                                || (myList.get(i).getSurname().equalsIgnoreCase(getNewSurname()))))) {
                            myList.get(i).setSurname(newSurname);
                            System.out.println(myList.get(i).toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("provide a new number of kids: ");

                    int newKindsNumber = scanner.nextInt();
                    for (int i = 0; i < myList.size(); i++) {
                        if (((myList.get(i).getName().equalsIgnoreCase(name))
                                || (myList.get(i).getName().equalsIgnoreCase(getNewName())
                                && (myList.get(i).getSurname().equalsIgnoreCase(surname))
                                || (myList.get(i).getSurname().equalsIgnoreCase(getNewSurname()))))) {
                            myList.get(i).setNumberOfChildren(newKindsNumber);
                            System.out.println(myList.get(i).toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("provide a new department: ");
                    int newDepartment = scanner.nextInt();
                    for (int i = 0; i < myList.size(); i++) {
                        if (((myList.get(i).getName().equalsIgnoreCase(name))
                                || (myList.get(i).getName().equalsIgnoreCase(getNewName())
                                && (myList.get(i).getSurname().equalsIgnoreCase(surname))
                                || (myList.get(i).getSurname().equalsIgnoreCase(getNewSurname()))))) {
                            myList.get(i).setDepartment(newDepartment);
                            System.out.println(myList.get(i).toString());
                        }
                    }
                    break;
                case 5:
                    System.out.println("provide new salary: ");
                    double newMoney = scanner.nextDouble();
                    for (int i = 0; i < myList.size(); i++) {
                        if (((myList.get(i).getName().equalsIgnoreCase(name))
                                || (myList.get(i).getName().equalsIgnoreCase(getNewName())
                                && (myList.get(i).getSurname().equalsIgnoreCase(surname))
                                || (myList.get(i).getSurname().equalsIgnoreCase(getNewSurname()))))) {
                            myList.get(i).setMoney(newMoney);
                            System.out.println(myList.get(i).toString());
                        }
                    }
                    break;

                case 6:
                    System.out.println("provide new martial status: ");
                    boolean newMartialStatus = scanner.nextBoolean();
                    for (int i = 0; i < myList.size(); i++) {
                        if (((myList.get(i).getName().equalsIgnoreCase(name))
                                || (myList.get(i).getName().equalsIgnoreCase(getNewName())
                                && (myList.get(i).getSurname().equalsIgnoreCase(surname))
                                || (myList.get(i).getSurname().equalsIgnoreCase(getNewSurname()))))) {
                            myList.get(i).setMaritalStatus(newMartialStatus);
                            System.out.println(myList.get(i).toString());
                        }
                    }
                    break;
                case 7:
                    System.out.println("Provide age: ");
                    int newAge = scanner.nextInt();
                    for (int i = 0; i < myList.size(); i++) {
                        if (((myList.get(i).getName().equalsIgnoreCase(name))
                                || (myList.get(i).getName().equalsIgnoreCase(getNewName())
                                && (myList.get(i).getSurname().equalsIgnoreCase(surname))
                                || (myList.get(i).getSurname().equalsIgnoreCase(getNewSurname()))))) {
                            myList.get(i).setAge(newAge);
                            System.out.println(myList.get(i).toString());
                        }
                    }
                    break;
                case 8:
                    System.out.println("Provide sex: ");
                    char newSex = scanner.next(".").charAt(0);
                    for (int i = 0; i < myList.size(); i++) {
                        if (((myList.get(i).getName().equalsIgnoreCase(name))
                                || (myList.get(i).getName().equalsIgnoreCase(getNewName())
                                && (myList.get(i).getSurname().equalsIgnoreCase(surname))
                                || (myList.get(i).getSurname().equalsIgnoreCase(getNewSurname()))))) {
                            myList.get(i).setSex(newSex);
                            System.out.println(myList.get(i).toString());
                        }
                    }
                    break;
                case 9:
                    System.out.println("Bye");
                    break;
            }
        }
    }
}



