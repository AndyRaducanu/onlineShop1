package org.andy.repository;

import org.andy.model.Order;
import org.andy.repository.base.BaseRepositoryImpl;

public class OrderRepositoryImpl extends BaseRepositoryImpl<Order> implements OrderRepository {
    public OrderRepositoryImpl() {
        super(Order.class);
    }
}
