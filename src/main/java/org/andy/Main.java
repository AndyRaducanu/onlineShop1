package org.andy;

import org.andy.enums.Status;
import org.andy.menu.PrincipalMenuImpl;
import org.andy.model.Order;
import org.andy.model.Product;
import org.andy.model.User;
import org.andy.repository.*;
import org.andy.util.SessionManager;

import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//        UserRepository userRepository = new UserRepositoryImpl();
//        OrderRepository orderRepository = new OrderRepositoryImpl();
//        ProductRepository productRepository = new ProductRepositoryImpl();
//
//
//
//        System.out.println(userRepository.findAll());
//        System.out.println("---------------------");
//        System.out.println(orderRepository.findAll());
//        System.out.println("---------------------");
//        System.out.println(productRepository.findAll());
//        Product product1 = new Product(
//                "tv",
//                "24inch",
//                "Samsung",
//                1200.00
//        );
//        Product product2 = new Product(
//                "tv",
//                "24inch",
//                "Samsung",
//                200d
//        );
//        Product product3 = new Product(
//                "tv",
//                "24inch",
//                "Samsung",
//                400d
//        );
//        productRepository.create(product3);
//        productRepository.create(product1);
//        productRepository.create(product2);
//
//        Order order1  = new Order(1200, Status.COMPLETED);
//        orderRepository.create(order1);
//        orderRepository.update(order1);
//
//        order1.setProducts(Set.of(product1,product2));
//        orderRepository.update(order1);
//        System.out.println("-------------------------");
//
//        System.out.println(productRepository.findAll());

        PrincipalMenuImpl.showMenu();
     //   SessionManager.shutdown();


    }
}