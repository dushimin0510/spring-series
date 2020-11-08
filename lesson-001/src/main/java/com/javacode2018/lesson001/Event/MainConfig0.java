package com.javacode2018.lesson001.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan
public class MainConfig0 {
    /*注册一个bean：事件发布者*/
    @Bean
    @Autowired(required = false)
    public EventMulticaster eventMulticaster(List<EventListener> listeners) {
        EventMulticaster multicaster = new SimpleEventMulticaster();
        if(listeners != null) {
            listeners.forEach(multicaster::addEventListener);
        }
        return multicaster;
    }
    /*用户注册服务的bean*/
    @Bean
    public UserRegisterService userRegisterService(EventMulticaster multicaster) {
        UserRegisterService userRegisterService = new UserRegisterService();
        userRegisterService.setEventMulticaster(multicaster);
        return userRegisterService;
    }
}
