package org.andy.menu;

import org.andy.enums.NameCategory;
import org.andy.model.Address;
import org.andy.model.Category;
import org.andy.repository.AddressRepository;
import org.andy.repository.AddressRepositoryImpl;
import org.andy.repository.CategoryRepository;
import org.andy.repository.CategoryRepositoryImpl;

import java.util.Scanner;

public class CategoryMenuImpl {

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Alegeti una din urmatoarele optiuni:");
            System.out.println("1.Add new category");
            System.out.println("2.Update category");
            System.out.println("3.Delete category");
            System.out.println("4.Display category by ID");
            System.out.println("5.Display all category");
            System.out.println("0.Back to the principal menu");
            System.out.println("Introduceti operatia pe care doriti sa o faceti:");
            option = scanner.nextInt();
            switch (option) {
                case 0: {
                    System.out.println("Ati ales sa iesiti din pogram");
                    break;
                }
                case 1: {
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Add new category");
                    addNewCategory();
                    break;
                }
                case 2:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Update category");
                    updateCategory();
                    break;
                }
                case 3:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Delete category");
                    deleteCategory();
                    break;
                }
                case 4:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Display category by ID");
                    displayCategoryById();
                    break;
                }
                case 5:{
                    // trebuie sa curatam ecranul
                    System.out.println("Ati ales optiunea Display all category.");
                    displayAllCategorys();
                    break;
                }
                default: {
                    System.out.println("optiunea aleasa nu este corecta");
                }
            }
        }while (option != 0);
    }

    public static void addNewCategory() {
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        int option;
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("Alegeti una din urmatoarele categorii:");
        System.out.println("1.PHOTO");
        System.out.println("2.ELECTRONICS");
        System.out.println("3.SMART_HOME");
        System.out.println("4.ART");
        System.out.println("5.COMPUTERS");
        System.out.println("6.SOFTWARE");
        System.out.println("7.VIDEO_GAMES");

        option = scannerInt.nextInt();
        NameCategory nameCategory = NameCategory.PHOTO;

        switch (option) {
            case 1: {
                nameCategory = NameCategory.PHOTO;
                break;
            }
            case 2: {
                nameCategory = NameCategory.ELECTRONICS;
                break;
            }
            case 3: {
                nameCategory = NameCategory.SMART_HOME;
                break;
            }
            case 4: {
                nameCategory = NameCategory.ART;
                break;
            }
            case 5: {
                nameCategory = NameCategory.COMPUTERS;
                break;
            }
            case 6: {
                nameCategory = NameCategory.SOFTWARE;
                break;
            }
            case 7: {
                nameCategory = NameCategory.VIDEO_GAMES;
                break;
            }
            default: {
                System.out.println("Nu ati ales o categorie corecta");
            }
        }
        Category category = new Category(nameCategory);
        categoryRepository.create(category);
    }
    public static void updateCategory() {
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        int option;
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Introduceti id categorie");
        int id = scannerInt.nextInt();
        System.out.println("Alegeti una din urmatoarele categorii:");
        System.out.println("1.PHOTO");
        System.out.println("2.ELECTRONICS");
        System.out.println("3.SMART_HOME");
        System.out.println("4.ART");
        System.out.println("5.COMPUTERS");
        System.out.println("6.SOFTWARE");
        System.out.println("7.VIDEO_GAMES");

        option = scannerInt.nextInt();
        NameCategory nameCategory = NameCategory.PHOTO;

        switch (option) {
            case 1: {
                nameCategory = NameCategory.PHOTO;
                break;
            }
            case 2: {
                nameCategory = NameCategory.ELECTRONICS;
                break;
            }
            case 3: {
                nameCategory = NameCategory.SMART_HOME;
                break;
            }
            case 4: {
                nameCategory = NameCategory.ART;
                break;
            }
            case 5: {
                nameCategory = NameCategory.COMPUTERS;
                break;
            }
            case 6: {
                nameCategory = NameCategory.SOFTWARE;
                break;
            }
            case 7: {
                nameCategory = NameCategory.VIDEO_GAMES;
                break;
            }
            default: {
                System.out.println("Nu ati ales o categorie corecta");
            }
        }
        Category category = new Category(nameCategory);

        category.setId(id);
        categoryRepository.update(category);
    }
    public static void deleteCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id Categorie");
        int id = scanner.nextInt();
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        Category category = new Category();
        category.setId(id);
        categoryRepository.delete(category);

    }


    public static void displayCategoryById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id pentru categoria dorit");
        int id = scanner.nextInt();
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        System.out.println(categoryRepository.findById(id));
    }

    public static void displayAllCategorys() {
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        System.out.println(categoryRepository.findAll());
    }
    
}
