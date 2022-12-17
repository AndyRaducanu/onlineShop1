package org.andy.model;

import org.andy.enums.Status;

public class Order {
    private Integer orderId;
    private Integer totalCost;
    private Status status;

    public Order() {
    }

    public Order(Integer totalCost, Status status) {
        this.totalCost = totalCost;
        this.status = status;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", totalCost=" + totalCost +
                ", status=" + status +
                '}';
    }
}
