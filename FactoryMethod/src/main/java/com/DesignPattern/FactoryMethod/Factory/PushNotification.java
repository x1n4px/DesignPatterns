package com.DesignPattern.FactoryMethod.Factory;

public class PushNotification implements Notification {
    @Override
    public String notifyUser(String message) {
        return "Enviando PUSH con mensaje: " + message;
    }
}
