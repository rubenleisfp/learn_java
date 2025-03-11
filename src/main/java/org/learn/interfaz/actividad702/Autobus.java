package org.learn.interfaz.actividad702;

public class Autobus implements Vehiculo{

	@Override
	public int velAutopista() {
		return 120;
	}

	@Override
	public int velCarretera() {
		return 90;
	}

	@Override
	public int velCarreteraSepFisica() {
		return 100;
	}

	@Override
	public int velSinPavimentar() {
		return 30;
	}

	@Override
	public String getTipoVehiculo() {
		return "Autobus";
	}
	
	

}
