package org.example.Immutable.Model;

public class Payment {
    private  String mobileNumber;
    private  int amountTransfer;

     private Account account;

    public Account getAccount() {
        return account;
    }

    public Payment(String mobileNumber, int amountTransfer, Account account) {
        this.mobileNumber = mobileNumber;
        this.amountTransfer = amountTransfer;
        this.account = account;
    }
    public Payment(String mobileNumber, int amountTransfer){
        this(mobileNumber,amountTransfer,new Account(null,null));

    }
    public Payment( int amountTransfer,Account account){
        this(null,amountTransfer,new Account("5566","9908"));

    }


    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getAmountTransfer() {
        return amountTransfer;
    }



}
