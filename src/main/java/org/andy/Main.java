package org.andy;

import org.andy.enums.Status;
import org.andy.model.Order;
import org.andy.model.Product;
import org.andy.model.User;
import org.andy.repository.*;
import org.andy.util.SessionManager;

import java.util.Set;

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
        System.out.println("------------------");
        Product product1 = new Product(
                "tv",
                "bun de 23",
                "lg"
        );
        Product product2 = new Product(
                "tv2",
                "bun de 23",
                "lgsss"
        );
        Product product3 = new Product(
                "telefon",
                "nou",
                "lg"
        );

        productRepository.create(product1);
        productRepository.create(product2);
        productRepository.create(product3);

        Order order = new Order(
                1200,
                Status.CANCELED
        );
        Order order1 = new Order(
                1200,
                Status.CANCELED
        );
        orderRepository.create(order);
        orderRepository.create(order1);


        order1.setProducts(Set.of(product1,product2));
        orderRepository.update(order1);

        order.setProducts(Set.of(product2,product3));
        orderRepository.update(order);

        System.out.println("------------------");
        System.out.println(orderRepository.findAll());
        System.out.println(productRepository.findAll());
        orderRepository.delete(order1);
        System.out.println(orderRepository.findAll());
        System.out.println(orderRepository.findById(1));












//        SessionManager.shutdown();
    }
}