package com.javacode2018.lesson001.Event;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleEventMulticaster implements EventMulticaster {

    private Map<Class<?>, List<EventListener>> eventObjectEventListenerMap = new ConcurrentHashMap<>();

    @Override
    public void multicastEvent(AbstractEvent event) {
        List<EventListener> listeners = this.eventObjectEventListenerMap.get(event.getClass());
        if(listeners != null) {
            listeners.stream().forEach(listener -> listener.onEvent(event));
        }
    }

    @Override
    public void addEventListener(EventListener<?> listener) {
        Class<?> eventType = this.getEventType(listener);
        List<EventListener> listeners = this.eventObjectEventListenerMap.get(eventType);
        if (listeners == null) {
            listeners = new ArrayList<EventListener>();
            this.eventObjectEventListenerMap.put(eventType, listeners);
        }
        listeners.add(listener);
    }

    @Override
    public void removeEventListener(EventListener<?> listener) {
        Class<?> eventType = this.getEventType(listener);
        if(this.eventObjectEventListenerMap.containsKey(eventType)) {
            this.eventObjectEventListenerMap.remove(eventType);
        }
    }

    protected Class<?> getEventType(EventListener listener) {
        //ParameterizedType代表的是一个泛型的实例
        ParameterizedType parameterizedType = (ParameterizedType) listener.getClass().getGenericInterfaces()[0];
        return (Class<?>) parameterizedType.getActualTypeArguments()[0];
    }
}
