package org.learn.herencia.ejemplo.animal;

public class Gallo extends Animal {

	@Override
	public String sonido() {
		return "kikiriki!";
	}

	@Override
	public int numeroPatas() {
		return 2;
	}
	
	@Override
	public int velocidad() {
		return 15;
	}

}
