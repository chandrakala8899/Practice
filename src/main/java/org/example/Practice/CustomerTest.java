package org.example.Practice;

public class CustomerTest {
    public static void main(String[] args) {

        Order order = new Order();

        OrderSummary orderSummary = new OrderSummary(order);
        System.out.println(orderSummary);
    }
}
