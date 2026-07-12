package com.chitkara.customexceptions;

// 1. Creating the Custom Exception Class
public class InsufficientFundsException extends RuntimeException {
    private final double shortfall;

    // Best Practice: Provide a clear error message and preserve the state
    public InsufficientFundsException(double shortfall, String message) {
        super(message);
        this.shortfall = shortfall;
    }

    public double getShortfall() {
        return shortfall;
    }
}


