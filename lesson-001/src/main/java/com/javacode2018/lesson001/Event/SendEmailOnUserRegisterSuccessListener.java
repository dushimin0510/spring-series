package com.javacode2018.lesson001.Event;

import org.springframework.stereotype.Component;

@Component
public class SendEmailOnUserRegisterSuccessListener implements EventListener<UserRegisterSuccessEvent>{

    @Override
    public void onEvent(UserRegisterSuccessEvent event) {
        System.out.println("注册成功" + "给" + event.getUsername() + "发邮件");
    }
}
