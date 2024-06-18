package org.example.Practice;

public class LoanTest {
    public static void main(String[] args) {
        Loan loan1 = new Loan();
        System.out.println(loan1);
        Loan loan2 = new Loan(10000, 12, 5.0);
        System.out.println(loan2);
        Loan loan3 = new Loan(10000, 12, 5.0, 20);
        System.out.println(loan3);
    }
}