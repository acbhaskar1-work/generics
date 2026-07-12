package com.chitkara.customexceptions;

// 2. Usage Example
class BankAccount {
    private double balance = 500.00;

    public void withdraw(double amount) {
        if (amount > balance) {
            double missingAmount = amount - balance;
            // Throwing the custom exception with exact domain context
            throw new InsufficientFundsException(missingAmount,
                    "Transaction denied: Account balance is low.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}
