package org.example.Practice;

public class Loan {
        private double principal;
        private int duration;
        private double annualInterestRate;
        private double processingFeePercentage;
    private double processingFee;
    private  double totalAmount;

    public double getPrincipal() {
        return principal;
    }

    public int getduration() {
        return duration;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getProcessingFeePercentage() {
        return processingFeePercentage;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "principal=" + principal +
                ", term=" + duration +
                ", annualInterestRate=" + annualInterestRate +
                ", processingFeePercentage=" + processingFeePercentage +
                ", processingFee=" + processingFee +
                '}';
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public Loan() {
            this(10000,12, 5.0);
        }

        public Loan(double principal, int duration, double annualInterestRate) {
            this.principal = principal;
            this.duration = duration;
            this.annualInterestRate = annualInterestRate;
        }

        public Loan(double principal, int duration, double annualInterestRate, double processingFeePercentage) {
            this(principal, duration, annualInterestRate);
            this.processingFeePercentage = processingFeePercentage;
            this.processingFee = principal * processingFeePercentage / 100;
            double finalAmount  = processingFee + principal;
            this.totalAmount = finalAmount;
            System.out.println(finalAmount);
        }

    }
