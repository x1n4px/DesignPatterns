package com.DesignPatterns.Builder;

import com.DesignPatterns.Builder.builders.CarBuilder;
import com.DesignPatterns.Builder.builders.CarManualBuilder;
import com.DesignPatterns.Builder.cars.Car;
import com.DesignPatterns.Builder.cars.Manual;
import com.DesignPatterns.Builder.director.Director;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BuilderApplication.class, args);
		Director director = new Director();

		// Director gets the concrete builder object from the client
		// (application code). That's because application knows better which
		// builder to use to get a specific product.
		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);

		// The final product is often retrieved from a builder object, since
		// Director is not aware and not dependent on concrete builders and
		// products.
		Car car = builder.getResult();
		System.out.println("Car built:\n" + car.getCarType());


		CarManualBuilder manualBuilder = new CarManualBuilder();

		// Director may know several building recipes.
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual built:\n" + carManual.print());
	}

}
