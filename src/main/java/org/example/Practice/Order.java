package org.example.Practice;

public class Order {
    private  double orderAmount;
    public Order() {
        this.orderAmount = 200.0;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderAmount=" + orderAmount +
                '}';
    }

    public double getorderAmount() {
        return orderAmount;
    }
}
