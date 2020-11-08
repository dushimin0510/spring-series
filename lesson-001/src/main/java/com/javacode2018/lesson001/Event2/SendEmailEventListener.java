package com.javacode2018.lesson001.Event2;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class SendEmailEventListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("单号为" + orderEvent.getOrderId() + "的订单创建成功, 我们给用户发送邮件了");
    }
}
