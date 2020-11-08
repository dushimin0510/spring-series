package com.javacode2018.lesson001.Event;

public class UserRegisterService {
    public EventMulticaster getEventMulticaster() {
        return eventMulticaster;
    }

    public void setEventMulticaster(EventMulticaster eventMulticaster) {
        this.eventMulticaster = eventMulticaster;
    }

    private EventMulticaster eventMulticaster;

    public void registerUser(String username) {
        System.out.println("用户" + username + "注册成功");
        this.eventMulticaster.multicastEvent(new UserRegisterSuccessEvent(this, username));
    }
}
