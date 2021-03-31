package com.itfb.deliveryrestapi.model.order;

public enum OrderStatus {

    READY("Выполнен"),
    CANCELED("Отменен"),
    IN_PROGRESS("Выполняется");

    private String value;

    OrderStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}