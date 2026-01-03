package com.day1.ewalletapplication;

class Main {

    public static void main(String[] args) {

        User pritam = new User("Pritam71", "Pritam", new PersonalWallet(1000));

        User ravi = new User("Ravi88", "Ravi", new BusinessWallet(5000)
        );

        // User actions
        pritam.loadMoney(2000);
        pritam.transferTo(ravi, 1200);

        System.out.println("\n===== WALLET SUMMARY =====\n");

        // Alice summary (balance first, then history)
        System.out.println("User : Pritam (Pritam71)");
        System.out.println("Balance : ₹" + pritam.checkBalance());
        pritam.showTransactions();

        System.out.println();

        // Shop summary
        System.out.println("User : Ravi (Ravi88)");
        System.out.println("Balance : ₹" + ravi.checkBalance());
        ravi.showTransactions();
    }
}