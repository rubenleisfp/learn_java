package org.learn.herencia.ejemplo.animal;

public class Paloma extends Animal {

	@Override
	public String sonido() {
		return "cucurrucucu paaaaaaloma!";
	}

	@Override
	public int numeroPatas() {

		return 2;
	}

}
