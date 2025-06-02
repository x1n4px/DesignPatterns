package com.DesignPattern.FactoryMethod.Factory;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        return switch (type.toUpperCase()) {
            case "EMAIL" -> new EmailNotificaction();
            case "SMS" -> new SmsNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Tipo de notificacion desconocida");
        };
    }
}
