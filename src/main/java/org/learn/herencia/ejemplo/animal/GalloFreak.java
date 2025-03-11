package org.learn.herencia.ejemplo.animal;

public class GalloFreak extends Animal {

	private String sonido;
	
	public GalloFreak (String sonido) {
		this.sonido = sonido;
	}
	
	
	@Override
	public String sonido() {
		return sonido;
	}

	@Override
	public int numeroPatas() {
		return 2;
	}

}
