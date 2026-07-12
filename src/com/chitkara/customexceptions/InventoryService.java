package com.chitkara.customexceptions;

public class InventoryService {
    public void reserveItems(String skuId, int quantity) {
        int currentStock = database.getStockFor(skuId); // Assume DB call

        if (quantity > currentStock) {
            throw new OutOfStockException(skuId, quantity, currentStock);
        }

        database.decrementStock(skuId, quantity);
    }
}
