package org.andy.menu;

import java.util.Scanner;

public class OrderMenuImpl {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Alegeti una din urmatoarele optiuni:");
            System.out.println("1.Add new order");
            System.out.println("2.Update order");
            System.out.println("3.Delete order");
            System.out.println("4.Display order by ID");
            System.out.println("5.Display all order");
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
                    System.out.println("Ati ales optiunea Add new order");
                    //ceva cod care sa ma duca la o functie Add new order
                    break;
                }
                case 2:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Update order");
                    //ceva cod care sa ma duca la o functie Update order
                    break;
                }
                case 3:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Delete order");
                    //ceva cod care sa ma duca in meniul de la Order
                    break;
                }
                case 4:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Display order by ID");
                    //ceva cod care sa ma duca in meniul de la Product
                    break;
                }
                case 5:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Display all order.");
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
