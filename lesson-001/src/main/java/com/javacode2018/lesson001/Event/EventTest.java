package com.javacode2018.lesson001.Event;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventTest {
    @Test
    public void test0() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig0.class);
        UserRegisterService service = context.getBean(UserRegisterService.class);
        service.registerUser("杜世敏");
    }
}
