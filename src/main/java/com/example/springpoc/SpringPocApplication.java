package com.example.springpoc;

import com.example.springpoc.beans.Person;
import com.example.springpoc.beans.Vehicle;
import com.example.springpoc.config.ProjectConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.util.Random;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringPocApplication {

	public static void main(String[] args) {


		/*Vehicle vehicle = new Vehicle();
		vehicle.setName("Honda");
		System.out.println("Vehicle name for non-spring context is " + vehicle.getName());*/

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		String[] persons = context.getBeanNamesForType(Person.class);
		Person person = context.getBean(Person.class);
		String[] names = context.getBeanNamesForType(Vehicle.class);

		person.getVehicle().getVehicleServices().playMusic();
		person.getVehicle().getVehicleServices().moveVehicle();
		/*Person person = context.getBean(Person.class);
		System.out.println("Person name from Spring Context is: " + person.getName());
		System.out.println("Vehicle that Person own is: " + person.getVehicle());*/


		/*Vehicle volkswagen = new Vehicle();
		volkswagen.setName("Volkswagen");
		Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

		Supplier<Vehicle> audiSupplier = () -> {
			Vehicle audi = new Vehicle();
			audi.setName("Audi");
			return audi;
		};

		Random random = new Random();
		int randomNumber = random.nextInt(10);
		System.out.println("randomNumber = " + randomNumber);

		if ((randomNumber % 2) == 0) {
			context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
		} else {
			context.registerBean("audi", Vehicle.class, audiSupplier);
		}

		Vehicle volksVehicle = null;
		Vehicle audiVehicle = null;

		try {
			volksVehicle = context.getBean("volkswagen", Vehicle.class);
		} catch (Exception e) {
			System.out.println("Error while creating Volkswagen vehicle");
		}

		try {
			audiVehicle = context.getBean("audi", Vehicle.class);
		} catch (Exception e) {
			System.out.println("Error while creating Audi vehicle");
		}

		if (null != volksVehicle) {
			System.out.println("Programming Vehicle name from Spring Context is: " + volksVehicle.getName());
		} else {
			System.out.println("Programming Vehicle name from Spring Context is: " + audiVehicle.getName());
		}*/

		/*Vehicle	veh = context.getBean(Vehicle.class);
		System.out.println("Vehicle name from Spring Context is: " + veh.getName());*/

		/*String hello = context.getBean(String.class);
		System.out.println("String value from Spring Context is: " + hello);
		Integer num = context.getBean(Integer.class);
		System.out.println("Integer value from Spring Context is: " + num);*/

		context.close();
	}

}
