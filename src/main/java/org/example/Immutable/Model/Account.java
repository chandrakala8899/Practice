package org.example.Immutable.Model;

public class Account {
    private String accountNumber;
    private  String mobileNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Account(String accountNumber, String mobileNumber) {
        this.accountNumber = accountNumber;
        this.mobileNumber = mobileNumber;
    }
}
