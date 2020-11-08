package com.javacode2018.lesson001.Event;

public interface EventMulticaster {

    void multicastEvent(AbstractEvent event);

    void addEventListener(EventListener<?> listener);

    void removeEventListener(EventListener<?> listener);
}
