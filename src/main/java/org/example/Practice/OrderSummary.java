package org.example.Practice;

public class OrderSummary {

    public Order order;

    private  double serviceCharges;

    @Override
    public String toString() {
        return "OrderSummary{" +
                "order=" + order +
                ", serviceCharges=" + serviceCharges +
                '}';
    }

    public Order getOrder() {
        return order;
    }

    public double getServiceCharges() {
        return serviceCharges;
    }

    public OrderSummary(Order order) {
        this(order,15);

        }

    public OrderSummary(Order order, double serviceChargesPercentage) {
        this.order = order;
        double serviceCharges = (order.getorderAmount()*serviceChargesPercentage)/100;
        this.serviceCharges = serviceCharges;
    }
}

