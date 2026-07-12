package com.chitkara.customexceptions;

public class OutOfStockException extends RuntimeException{
    private final String skuId;
    private final int requestedQuantity;
    private final int availableQuantity;

    public OutOfStockException(String skuId, int requestedQuantity, int availableQuantity) {
        super(String.format("Item %s is out of stock. Requested: %d, Available: %d",
                skuId, requestedQuantity, availableQuantity));
        this.skuId = skuId;
        this.requestedQuantity = requestedQuantity;
        this.availableQuantity = availableQuantity;
    }

    // Getters for the API layer to read metadata
    public String getSkuId() { return skuId; }
    public int getRequestedQuantity() { return requestedQuantity; }
    public int getAvailableQuantity() { return availableQuantity; }
}
