package org.andy.menu;

import java.util.Scanner;

public class PrincipalMenuImpl {


    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Alegeti una din urmatoarele optiuni:");
            System.out.println("1.Address");
            System.out.println("2.Category");
            System.out.println("3.Order");
            System.out.println("4.Product");
            System.out.println("5.User");
            System.out.println("0.Exit");
            System.out.println("Introduceti operatia pe care doriti sa o faceti:");
            option = scanner.nextInt();
            switch (option) {
                case 0: {
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales sa iesiti din pogram");
                    // ceva cod care sa faca iesirea dn aplicatie
                    break;
                }
                case 1: {
                    System.out.print("\u001B[2J");
                    System.out.print('\f');
                    System.out.print('\u000C');
                    System.out.println("Ati ales optiunea Address");
                    AddressMenuImpl.showMenu();
                    //ceva cod care sa ma duca in meniul de la address
                    break;
                }
                case 2:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Category");
                    CategoryMenuImpl.showMenu();
                    break;
                }
                case 3:{
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Ati ales optiunea Order");
                    OrderMenuImpl.showMenu();
                    break;
                }
                case 4:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Product");
                    ProductMenuImpl.showMenu();
                    break;
                }
                case 5:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea User");
                    UserMenuImpl.showMenu();
                    break;
                }
                default: {
                    System.out.println("optiunea aleasa nu este corecta");
                }
            }
        }while (option != 0);
    }
}
