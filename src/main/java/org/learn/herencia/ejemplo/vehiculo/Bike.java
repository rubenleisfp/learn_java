package org.learn.herencia.ejemplo.vehiculo;

public class Bike extends Vehicle{

	@Override
	public void honk() { // Vehicle method
		System.out.println("Ring!,Ring!");
	}
}
