package org.learn.herencia.ejemplo.animal;

public class Gaviota extends Animal{

	@Override
	public String sonido() {
		return "kakaka";
	}

	@Override
	public int numeroPatas() {
		return 2;
	}

}
