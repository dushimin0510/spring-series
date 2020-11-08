package com.javacode2018.lesson001.Event2;

import org.springframework.context.ApplicationEvent;

public class OrderEvent extends ApplicationEvent {

    private int orderId;

    public OrderEvent(Object source, int orderId) {
        super(source);
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
