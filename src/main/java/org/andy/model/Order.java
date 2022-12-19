package org.andy.model;

import org.andy.enums.Status;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;
    @Column(name = "total_cost")
    private Integer totalCost;
    @Column(name = "status")
    private Status status;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private User user;

    public Order() {
    }

    public Order(Integer totalCost, Status status) {
        this.totalCost = totalCost;
        this.status = status;
    }

    public Integer getOrderId() {
        return Id;
    }

    public void setOrderId(Integer orderId) {
        this.Id = orderId;
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

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + Id +
                ", totalCost=" + totalCost +
                ", status=" + status +
                '}';
    }
}
