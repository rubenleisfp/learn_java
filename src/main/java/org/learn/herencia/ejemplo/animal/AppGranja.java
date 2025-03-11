package org.learn.herencia.ejemplo.animal;

import java.util.ArrayList;
import java.util.List;

public class AppGranja {

	public static void main(String[] args) {
		Gallo gallo1 = new Gallo();
		System.out.println(gallo1.sonido());
		
		Gaviota gaviota1 = new Gaviota();
		System.out.println(gaviota1.sonido());
		
		Paloma paloma1 = new Paloma();
		System.out.println(paloma1.sonido());
		
		System.out.println("#####################");
		
		Animal gallo2 = new Gallo();
		System.out.println(gallo2.sonido());
	
		Animal gaviota2 = new Gaviota();
		System.out.println(gaviota2.sonido());
		
		Animal paloma2 = new Paloma();
		System.out.println(paloma2.sonido());
		
		System.out.println("#####################");
		
		Animal animal = new Paloma();
		System.out.println(animal.sonido());
		
		System.out.println("#####################");
		
		GalloFreak galloFreak1 = new GalloFreak("popopopo!");
		GalloFreak galloFreak2 = new GalloFreak("papapapapa!");
		
		
		System.out.println(galloFreak1.sonido());
		System.out.println(galloFreak2.sonido());
		
		System.out.println("#####################");
		
		
		List<Animal> animales = new ArrayList<Animal>();
		animales.add(gallo1);
		animales.add(gaviota1);
		animales.add(paloma2);
		
		for (Animal a : animales) {
			System.out.println(a.sonido());
			System.out.println(a.velocidad());
		}
		
		

	}

}
