package org.andy.model;

import org.andy.enums.Status;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "total_cost")
    private Integer totalCost;
    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private Status status;


    @ManyToOne
    @JoinColumn(name = "order_id")
    private User user;

    @ManyToMany
    @JoinTable(
            name = "order_line",
            joinColumns = {@JoinColumn(name = "order_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")}
    )
    private Set<Product> products;
    //    TODO daca setam si cantitatea de produse schimbam set in map


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

//    TODO functie totalprice, in functie de ce pret detin produsele din comanda
//    TODO adauga nr de produse in comanda
}
