package com.javacode2018.lesson001.Event2;

import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

public class Test{
    @org.junit.Test
    public void Test(){
        ApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
        multicaster.addApplicationListener(new SendEmailEventListener());
        multicaster.multicastEvent(new OrderEvent(this, 10086));
    }
}
