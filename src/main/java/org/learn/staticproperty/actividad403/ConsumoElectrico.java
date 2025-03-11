package org.learn.staticproperty.actividad403;

public class ConsumoElectrico {

	public static void main(String[] args) {
        AparatoElectrico bombilla = new AparatoElectrico(150);
        AparatoElectrico plancha = new AparatoElectrico(2000);
        
        System.out.println("El consumo electrico es "+AparatoElectrico.consumo());
        
        bombilla.enciende();
        plancha.enciende();
        
        System.out.println("El consumo electrico es "+AparatoElectrico.consumo());
        
        plancha.apaga();
        
        System.out.println("El consumo electrico es "+AparatoElectrico.consumo());

        
    }
}