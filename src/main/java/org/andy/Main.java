package org.andy;

import org.andy.model.User;
import org.andy.repository.OrderRepository;
import org.andy.repository.OrderRepositoryImpl;
import org.andy.repository.UserRepository;
import org.andy.repository.UserRepositoryImpl;
import org.andy.util.SessionManager;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();
        OrderRepository orderRepository = new OrderRepositoryImpl();
        System.out.println(userRepository.findById(1));
        System.out.println("------------------");
        System.out.println(orderRepository.findById(1));







        SessionManager.shutdown();
    }
}