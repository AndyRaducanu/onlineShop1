package org.andy.model;

import org.andy.enums.Status;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "total_cost")
    private Integer totalCost;
    @Column(name = "status")
    private Status status;


    @ManyToOne
    @JoinColumn(name = "order_id")
    private User user;


    private Set<Product> products;

    public Order() {
    }

    public Order(Integer totalCost, Status status) {
        this.totalCost = totalCost;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + id +
                ", totalCost=" + totalCost +
                ", status=" + status +
                '}';
    }
}
