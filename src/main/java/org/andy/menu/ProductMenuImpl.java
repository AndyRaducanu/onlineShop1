package org.andy.menu;

import org.andy.model.Address;
import org.andy.model.Order;
import org.andy.model.Product;
import org.andy.repository.*;

import java.util.Scanner;

public class ProductMenuImpl {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Alegeti una din urmatoarele optiuni:");
            System.out.println("1.Add new product");
            System.out.println("2.Update product");
            System.out.println("3.Delete product");
            System.out.println("4.Display product by ID");
            System.out.println("5.Display all product");
            System.out.println("0.Back to the principal menu");
            System.out.println("Introduceti operatia pe care doriti sa o faceti:");
            option = scanner.nextInt();
            switch (option) {
                case 0: {
                    System.out.println("Ati ales sa iesiti din pogram");
                    break;
                }
                case 1: {
                    System.out.println("Ati ales optiunea Add new product");
                    addNewProduct();
                    break;
                }
                case 2: {
                    System.out.println("Ati ales optiunea Update product");
                    updateProduct();
                    break;
                }
                case 3: {
                    System.out.println("Ati ales optiunea Delete product");
                    deleteProduct();
                    break;
                }
                case 4: {

                    System.out.println("Ati ales optiunea Display product by ID");
                    displayProductById();
                    break;
                }
                case 5: {
                    System.out.println("Ati ales optiunea Display all product.");
                    displayAllProducts();
                    break;
                }
                default: {
                    System.out.println("optiunea aleasa nu este corecta");
                }
            }
        } while (option != 0);
    }

    public static void addNewProduct() {
        ProductRepository productRepository = new ProductRepositoryImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti linia pentru name: ");
        String name = scanner.nextLine();
        System.out.println("Introduceti linia pentru description: ");
        String description = scanner.nextLine();
        System.out.println("Introduceti linia pentru manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.println("Introduceti linia pentru price: ");
        double price = scanner.nextInt();
        Product product = new Product(name,description,manufacturer,price);
        productRepository.create(product);

    }

    public static void updateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id produs");
        int id = Integer.valueOf(scanner.nextLine());


        System.out.println("Introduceti linia pentru name: ");
        String name = scanner.nextLine();
        System.out.println("Introduceti linia pentru description: ");
        String description = scanner.nextLine();
        System.out.println("Introduceti linia pentru manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.println("Introduceti linia pentru price: ");
        double price = scanner.nextInt();

        ProductRepository productRepository = new ProductRepositoryImpl();
        Product product = new Product(name,description,manufacturer,price);

        product.setId(id);
        productRepository.update(product);

    }

    public static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id produs");
        int id = scanner.nextInt();
        ProductRepository productRepository = new ProductRepositoryImpl();
        Product product = new Product();
        product.setId(id);
        productRepository.delete(product);

    }

    public static void displayProductById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id pentru produsul dorit");
        int id = scanner.nextInt();
        ProductRepository productRepository = new ProductRepositoryImpl();
        System.out.println(productRepository.findById(id));
    }

    public static void displayAllProducts() {
        ProductRepository productRepository = new ProductRepositoryImpl();
        System.out.println(productRepository.findAll());
    }
}
