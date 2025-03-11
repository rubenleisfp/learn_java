package org.learn.herencia.ejemplo.vehiculo;

import java.util.ArrayList;
import java.util.List;

public class AppCoche {

	public static void main(String[] args) {

		// Create a myCar object
		Vehicle vehicle = new Vehicle();
		vehicle.honk();
		
		
		Car myCar = new Car();
		

		// Call the honk() method (from the Vehicle class) on the myCar object
		myCar.honk();
		myCar.metodoPropioCoche();
		
		
		
		
		System.out.println(myCar.brand);
		System.out.println(myCar.modelName);

		// Display the value of the brand attribute (from the Vehicle class) and the
		// value of the modelName from the Car class
		//System.out.println(myCar.brand + " " + myCar.modelName);
		
		Bike bike1 = new Bike();
		System.out.println("Pitido bici 1:");
		bike1.honk(); //MOU/KIARA/PONCE: Ring, Ring
		
		Vehicle bike2 = new Bike();
		System.out.println("Pitido bici 2:");
		bike2.honk(); //MOU/KIARA/PONCE: Pi, Pi
		
		
		// Create a myCar object
		Vehicle v = new Vehicle();
		System.out.println("Pitido vehicle:");
		v.honk();
		
		
		List<Vehicle> vehiculos = new ArrayList<Vehicle>();
		vehiculos.add(vehicle);
		vehiculos.add(myCar);
		vehiculos.add(bike1);
		
		System.out.println("##################");
		
		for (Vehicle vehiculo : vehiculos) {
			vehiculo.honk();
		}
		//Pi pi
		//Pi pi
		//Ring ring
	}

}
