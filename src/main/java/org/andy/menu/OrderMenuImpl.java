package org.andy.menu;

import org.andy.enums.Status;
import org.andy.model.Address;
import org.andy.model.Order;
import org.andy.repository.AddressRepository;
import org.andy.repository.AddressRepositoryImpl;
import org.andy.repository.OrderRepository;
import org.andy.repository.OrderRepositoryImpl;

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
                    System.out.println("Ati ales sa iesiti din pogram");
                    break;
                }
                case 1: {
                    System.out.println("Ati ales optiunea Add new order");
                    addNewOrder();
                    break;
                }
                case 2:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Update order");
                    updateOrder();
                    break;
                }
                case 3:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Delete order");
                    deleteOrder();
                    break;
                }
                case 4:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Display order by ID");
                    displayOrderById();
                    break;
                }
                case 5:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Display all order.");
                    displayAllOrders();
                    break;
                }
                default: {
                    System.out.println("optiunea aleasa nu este corecta");
                }
            }
        }while (option != 0);
    }
    public static void addNewOrder() {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        int option;
        Scanner scanner = new Scanner(System.in);

        Integer totalCost;
        System.out.println("Dati pretul comenzii:");
        totalCost = Integer.valueOf(scanner.nextLine());

        System.out.println("Alegeti una din urmatoarele statusuri:");
        System.out.println("1.CANCELED");
        System.out.println("2.PENDING");
        System.out.println("3.COMPLETED");
        System.out.println("4.ON_HOLD");
        System.out.println("5.PROCESSING");
        System.out.println("6.REFUNDED");

        option = Integer.valueOf(scanner.nextLine());
        Status status = Status.CANCELED;

        switch (option) {
            case 1: {
                status = Status.CANCELED;
                break;
            }
            case 2: {
                status = Status.PENDING;
                break;
            }
            case 3: {
                status = Status.COMPLETED;
                break;
            }
            case 4: {
                status = Status.ON_HOLD;
                break;
            }
            case 5: {
                status = Status.PROCESSING;
                break;
            }
            case 6: {
                status = Status.REFUNDED;
                break;
            }
            default: {
                System.out.println("Nu ati ales un status corect");
            }
        }
        Order order = new Order(totalCost,status);
        orderRepository.create(order);
    }
    public static void updateOrder() {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        int option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti id order");
        int id = Integer.valueOf(scanner.nextLine());

        Integer totalCost;
        System.out.println("Dati pretul comenzii:");
        totalCost = Integer.valueOf(scanner.nextLine());

        System.out.println("Alegeti una din urmatoarele statusuri:");
        System.out.println("1.CANCELED");
        System.out.println("2.PENDING");
        System.out.println("3.COMPLETED");
        System.out.println("4.ON_HOLD");
        System.out.println("5.PROCESSING");
        System.out.println("6.REFUNDED");

        option = Integer.valueOf(scanner.nextLine());
        Status status = Status.CANCELED;

        switch (option) {
            case 1: {
                status = Status.CANCELED;
                break;
            }
            case 2: {
                status = Status.PENDING;
                break;
            }
            case 3: {
                status = Status.COMPLETED;
                break;
            }
            case 4: {
                status = Status.ON_HOLD;
                break;
            }
            case 5: {
                status = Status.PROCESSING;
                break;
            }
            case 6: {
                status = Status.REFUNDED;
                break;
            }
            default: {
                System.out.println("Nu ati ales un status corect");
            }
        }
        Order order = new Order(totalCost,status);
        order.setId(id);
        orderRepository.update(order);
    }

    public static void deleteOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id comanda");
        int id = scanner.nextInt();
        OrderRepository orderRepository = new OrderRepositoryImpl();
        Order order = new Order();
        order.setId(id);
        orderRepository.delete(order);

    }

    public static void displayOrderById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id pentru comanda dorit");
        int id = scanner.nextInt();
        OrderRepository orderRepository = new OrderRepositoryImpl();
        System.out.println(orderRepository.findById(id));
    }

    public static void displayAllOrders() {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        System.out.println(orderRepository.findAll());
    }
}
