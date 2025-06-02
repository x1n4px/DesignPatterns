package com.DesignPattern.FactoryMethod.Controller;


import com.DesignPattern.FactoryMethod.Factory.Notification;
import com.DesignPattern.FactoryMethod.Factory.NotificationFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notify")
public class NotificationController {
    @PostMapping
    public String notifyUser(@RequestParam String type, @RequestParam String message) {
        Notification notification = NotificationFactory.createNotification(type);
        return notification.notifyUser(message);
    }
}
