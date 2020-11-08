package com.javacode2018.lesson001.Event;

public interface EventListener <E extends AbstractEvent> {
    void onEvent(E event);
}
