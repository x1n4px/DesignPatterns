package com.DesignPattern.FactoryMethod.Factory;

public class SmsNotification implements Notification{
    @Override
    public String notifyUser(String message) {
        return "Enviando SMS con mensaje: " + message;
    }
}
