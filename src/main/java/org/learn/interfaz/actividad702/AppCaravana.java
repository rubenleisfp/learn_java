package org.learn.interfaz.actividad702;

import java.util.ArrayList;
import java.util.List;

public class AppCaravana {

	public static void main(String[] args) {
		Turismo turismo = new Turismo();
		Camion camion = new Camion();
		Autobus autobus = new Autobus();
		
		List<Vehiculo> caravana = new ArrayList<Vehiculo>();
		caravana.add(turismo);
		caravana.add(camion);
		caravana.add(autobus);
		
		imprimirCaravana(caravana);
		
	}
	
	
	public static void imprimirCaravana (List<Vehiculo> caravana) {
		for (Vehiculo vehiculo : caravana) {
			
			System.out.println("Tipo de vehiculo: " + vehiculo.getTipoVehiculo());
			System.out.println("Velocidad autopista:" + vehiculo.velAutopista());
//			System.out.println("Velocidad carretera:" + vehiculo.velCarretera());
//			System.out.println("Velocidad scarretera sep. fisica:" + vehiculo.velCarreteraSepFisica());
//			System.out.println("Velocidad carretera sin pavimentar:" + vehiculo.velSinPavimentar());
			System.out.println("####################################");
		}
	}

}
