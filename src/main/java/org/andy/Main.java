package org.andy;

import org.andy.model.User;
import org.andy.repository.*;
import org.andy.util.SessionManager;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();
        OrderRepository orderRepository = new OrderRepositoryImpl();
        ProductRepository productRepository = new ProductRepositoryImpl();
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();

        System.out.println(userRepository.findById(1));
        System.out.println("------------------");
        System.out.println(orderRepository.findById(1));
        System.out.println("------------------");
        System.out.println(productRepository.findAll());
        System.out.println("------------------");
        System.out.println(categoryRepository.findAll());







        SessionManager.shutdown();
    }
}