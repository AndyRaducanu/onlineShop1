package org.andy.menu;

import org.andy.model.Address;
import org.andy.repository.AddressRepository;
import org.andy.repository.AddressRepositoryImpl;

import java.util.Scanner;

public class AddressMenuImpl {
    AddressRepository addressRepository = new AddressRepositoryImpl();

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Alegeti una din urmatoarele optiuni:");
            System.out.println("1.Add new address");
            System.out.println("2.Update address");
            System.out.println("3.Delete address");
            System.out.println("4.Display address by ID");
            System.out.println("5.Display all address");
            System.out.println("0.Back to the principal menu");
            System.out.println("Introduceti operatia pe care doriti sa o faceti:");
            option = scanner.nextInt();
            switch (option) {
                case 0: {
                    System.out.println("Ati ales sa mergeti la meniul principal");

                    break;
                }
                case 1: {
                    System.out.println("Ati ales optiunea Add new address");
                    addNewAddress();
                    break;
                }
                case 2: {
                    System.out.println("Ati ales optiunea Update address");
                    updateAddress();
                    break;
                }
                case 3: {
                    System.out.println("Ati ales optiunea Delete address");
                    deleteAddress();
                    break;
                }
                case 4: {
                    System.out.println("Ati ales optiunea Display address by ID");
                    displayAddressById();
                    break;
                }
                case 5: {
                    System.out.println("Ati ales optiunea Display all address.");
                    displayAllAddress();
                    break;
                }
                default: {
                    System.out.println("optiunea aleasa nu este corecta");
                }
            }
        } while (option != 0);
    }

    public static void addNewAddress() {
        AddressRepository addressRepository = new AddressRepositoryImpl();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti linia pentru country: ");
        String country = scanner.nextLine();
        System.out.println("Introduceti linia pentru city: ");
        String city = scanner.nextLine();
        System.out.println("Introduceti linia pentru street: ");
        String street = scanner.nextLine();
        System.out.println("Introduceti linia pentru zipCode: ");
        int zipCode = scanner.nextInt();
        Address address = new Address(country, city, street, zipCode);
        addressRepository.create(address);

    }

    public static void updateAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id adresa");
        int id = scanner.nextInt();
        AddressRepository addressRepository = new AddressRepositoryImpl();

        System.out.println("Introduceti linia pentru country: ");
        String country = scanner.nextLine();
        System.out.println("Introduceti linia pentru city: ");
        String city = scanner.nextLine();
        System.out.println("Introduceti linia pentru street: ");
        String street = scanner.nextLine();
        System.out.println("Introduceti linia pentru zipCode: ");
        int zipCode = scanner.nextInt();
        Address address = new Address(country, city, street, zipCode);

        address.setId(id);
        addressRepository.update(address);

    }

    public static void deleteAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id adresa");
        int id = scanner.nextInt();
        AddressRepository addressRepository = new AddressRepositoryImpl();
        Address address = new Address();
        address.setId(id);
        addressRepository.delete(address);

    }

    public static void displayAddressById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id adresa dorit");
        int id = scanner.nextInt();
        AddressRepository addressRepository = new AddressRepositoryImpl();
        System.out.println(addressRepository.findById(id));
    }

    public static void displayAllAddress() {
        AddressRepository addressRepository = new AddressRepositoryImpl();
        System.out.println(addressRepository.findAll());
    }
}
