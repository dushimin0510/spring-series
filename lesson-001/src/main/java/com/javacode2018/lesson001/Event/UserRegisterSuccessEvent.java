package com.javacode2018.lesson001.Event;

public class UserRegisterSuccessEvent extends AbstractEvent {
    private  String username;

    public UserRegisterSuccessEvent(Object source, String username) {
        super(source);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
