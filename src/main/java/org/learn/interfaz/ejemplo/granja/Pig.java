package org.learn.interfaz.ejemplo.granja;

public class Pig implements Animal {

	@Override
	public void animalSound() {
		 System.out.println("The pig says: wee wee");
	}


	@Override
	public int move() {
		return 15;
	}

}
