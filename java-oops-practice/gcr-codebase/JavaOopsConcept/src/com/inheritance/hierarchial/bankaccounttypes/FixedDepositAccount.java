package com.inheritance.hierarchial.bankaccounttypes;


public class FixedDepositAccount extends BankAccount {

    private int maturityPeriod; // in years

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type    : Fixed Deposit Account");
        displayBasicInfo();
        System.out.println("Maturity Period: " + maturityPeriod + " years");
    }
}
