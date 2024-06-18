package org.example.Immutable.Model;

public class PaymentTest {
    public static void main(String[] args){
        Payment payment = new Payment("9908",3000);
        payment.getAmountTransfer();
        payment.getMobileNumber();
        System.out.println(payment.getAccount());

        Account account = new Account("4455","8688");
        account.getAccountNumber();
        account.getMobileNumber();
        System.out.println(account);

        Payment payment1 = new Payment(3000,account);
        System.out.println(payment1);

    }
}
