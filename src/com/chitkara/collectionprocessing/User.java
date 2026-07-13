package com.chitkara.collectionprocessing;

class User {
    private final String name;
    private final boolean active;
    private final double balance;

    public User(String name, boolean active, double balance) {
        this.name = name;
        this.active = active;
        this.balance = balance;
    }
    public boolean isActive() { return active; }
    public double getBalance() { return balance; }
}
