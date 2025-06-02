# 🏭 Notificación API - Patrón Factory Method en Spring Boot

Este proyecto es una demostración práctica del **patrón de diseño Factory Method** utilizando **Spring Boot**. La aplicación expone una API REST que permite enviar notificaciones de diferentes tipos (`EMAIL`, `SMS`, `PUSH`) mediante la creación dinámica del objeto adecuado en tiempo de ejecución.

---

## 📦 Tecnologías utilizadas

- Java 17+
- Spring Boot 3.x
- Maven

---

## 🎯 Objetivo

El objetivo de este proyecto es demostrar cómo aplicar el patrón de diseño **Factory Method**, que permite delegar la creación de objetos a una subclase o clase fábrica en lugar de instanciar directamente con `new`.

---

## 🧠 ¿Qué es el patrón Factory Method?

El **Factory Method** es un patrón de creación que proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases alteren el tipo de objetos que se crean. Promueve:

- Desacoplamiento de código cliente y clases concretas.
- Extensibilidad sin modificar el código existente (principio abierto/cerrado).

---

## 🧱 Estructura del proyecto


---

## ⚙️ Cómo funciona

1. El cliente (controlador REST) recibe una solicitud con el tipo de notificación (`type`) y el mensaje.
2. Llama a `NotificationFactory.createNotification(type)`.
3. La fábrica devuelve una instancia concreta (`EmailNotification`, `SmsNotification`, etc.).
4. Se llama al método `notifyUser()` del objeto retornado.

---

## 📬 Ejemplo de uso

### 📡 Endpoint

```http
POST /api/notify?type=email&message=Hola%20usuario





curl -X POST "http://localhost:8080/api/notify?type=email&message=Hola%20usuario"
