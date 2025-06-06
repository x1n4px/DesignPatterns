package com.DesignPatterns.AbstractFactory;

import com.DesignPatterns.AbstractFactory.client.VehicleAssembler;
import com.DesignPatterns.AbstractFactory.factory.VehicleFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AbstractFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ApplicationContext context) { // ¡Aquí está la corrección! Recibe ApplicationContext
		return args -> {
			System.out.println("--- Abstract Factory Example ---");

			// Ejemplo con CarFactory
			System.out.println("\nEnsamblando un coche:");
			// Obtenemos la fábrica de coches del contexto de Spring
			VehicleFactory carFactory = context.getBean("carFactory", VehicleFactory.class);
			// Inyectamos la fábrica al ensamblador
			VehicleAssembler carAssembler = new VehicleAssembler(carFactory);
			System.out.println(carAssembler.assembleVehicle());

			// Ejemplo con MotorcycleFactory
			System.out.println("\nEnsamblando una moto:");
			// Obtenemos la fábrica de motos del contexto de Spring
			VehicleFactory motorcycleFactory = context.getBean("motorcycleFactory", VehicleFactory.class);
			// Inyectamos la fábrica al ensamblador
			VehicleAssembler motorcycleAssembler = new VehicleAssembler(motorcycleFactory);
			System.out.println(motorcycleAssembler.assembleVehicle());

			System.out.println("\n--- Fin del ejemplo ---");
		};
	}

}
