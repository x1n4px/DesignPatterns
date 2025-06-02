package com.DesignPattern.FactoryMethod.Factory;

public class EmailNotificaction implements Notification {
    @Override
    public String notifyUser(String message) {
        return "Enviando EMAIL con mensaje:  " + message;
    }
}
