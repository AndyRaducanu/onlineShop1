package org.andy.menu;

import java.util.Scanner;

public class UserMenuImpl {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Alegeti una din urmatoarele optiuni:");
            System.out.println("1.Add new user");
            System.out.println("2.Update user");
            System.out.println("3.Delete user");
            System.out.println("4.Display user by ID");
            System.out.println("5.Display all user");
            System.out.println("0.Back to the principal menu");
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
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Add new user");
                    //ceva cod care sa ma duca la o functie Add new user
                    break;
                }
                case 2:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Update user");
                    //ceva cod care sa ma duca la o functie Update user
                    break;
                }
                case 3:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Delete user");
                    //ceva cod care sa ma duca in meniul de la Order
                    break;
                }
                case 4:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Display user by ID");
                    //ceva cod care sa ma duca in meniul de la Product
                    break;
                }
                case 5:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Display all user.");
                    // ceva apel de functie
                    break;
                }
                case 6:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea sa reveniti la meniul principal");
                    PrincipalMenuImpl.showMenu();
                    break;
                }
                default: {
                    System.out.println("optiunea aleasa nu este corecta");
                }
            }
        }while (option != 0);
    }
}
