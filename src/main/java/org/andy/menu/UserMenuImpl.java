package org.andy.menu;

import org.andy.enums.NameCategory;
import org.andy.enums.Role;
import org.andy.model.Address;
import org.andy.model.User;
import org.andy.repository.AddressRepository;
import org.andy.repository.AddressRepositoryImpl;
import org.andy.repository.UserRepository;
import org.andy.repository.UserRepositoryImpl;

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
                    System.out.println("Ati ales sa iesiti din pogram");
                    break;
                }
                case 1: {
                    System.out.println("Ati ales optiunea Add new user");
                    addNewUser();
                    break;
                }
                case 2: {
                    System.out.println("Ati ales optiunea Update user");
                    updateUser();
                    break;
                }
                case 3: {
                    System.out.println("Ati ales optiunea Delete user");
                    deleteUser();
                    break;
                }
                case 4: {
                    System.out.println("Ati ales optiunea Display user by ID");
                    displayUserById();
                    break;
                }
                case 5: {
                    System.out.println("Ati ales optiunea Display all user.");
                    displayAllUsers();
                    break;
                }
                default: {
                    System.out.println("optiunea aleasa nu este corecta");
                }
            }
        } while (option != 0);
    }

    public static void addNewUser() {
        UserRepository userRepository = new UserRepositoryImpl();
        int option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti linia pentru email: ");
        String email = scanner.nextLine();
        System.out.println("Introduceti linia pentru password: ");
        String password = scanner.nextLine();
        System.out.println("Introduceti linia pentru nume: ");
        String name = scanner.nextLine();
        System.out.println("Alegeti una din urmatoarele roluri:");
        System.out.println("1.ADMIN");
        System.out.println("2.USER");
        option = Integer.valueOf(scanner.nextLine());
        Role role = Role.USER;
        switch (option) {
            case 1 -> {
                role = Role.USER;
                break;
            }
            case 2 -> {
                role = Role.ADMIN;
                break;
            }
            default -> {
                System.out.println("Nu ati ales un rol corecta");
            }
        }
        User user = new User(email, password, name, role);
        userRepository.create(user);


    }

    public static void updateUser() {
        UserRepository userRepository = new UserRepositoryImpl();

        int option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id utilizator:");
        int id =Integer.valueOf(scanner.nextLine());

        System.out.println("Introduceti linia pentru email: ");
        String email = scanner.nextLine();
        System.out.println("Introduceti linia pentru password: ");
        String password = scanner.nextLine();
        System.out.println("Introduceti linia pentru nume: ");
        String name = scanner.nextLine();
        System.out.println("Alegeti una din urmatoarele roluri:");
        System.out.println("1.ADMIN");
        System.out.println("2.USER");
        option = Integer.valueOf(scanner.nextLine());
        Role role = Role.USER;
        switch (option) {
            case 1 -> {
                role = Role.USER;
                break;
            }
            case 2 -> {
                role = Role.ADMIN;
                break;
            }
            default -> {
                System.out.println("Nu ati ales un rol corecta");
            }
        }
        User user = new User(email, password, name, role);
        user.setId(id);
        userRepository.update(user);


    }

    public static void deleteUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id utilizator");
        int id = scanner.nextInt();
        UserRepository userRepository = new UserRepositoryImpl();
        User user = new User();
        user.setId(id);
        userRepository.delete(user);

    }

    public static void displayUserById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id utilizator dorit");
        int id = scanner.nextInt();
        UserRepository userRepository = new UserRepositoryImpl();
        System.out.println(userRepository.findById(id));
    }

    public static void displayAllUsers() {
        UserRepository userRepository = new UserRepositoryImpl();
        System.out.println(userRepository.findAll());
    }
}
