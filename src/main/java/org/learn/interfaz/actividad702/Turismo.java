package org.learn.interfaz.actividad702;

public class Turismo implements Vehiculo{

	@Override
	public int velAutopista() {
		return 100;
	}

	@Override
	public int velCarretera() {
		return 80;
	}

	@Override
	public int velCarreteraSepFisica() {
		return 80;
	}

	@Override
	public int velSinPavimentar() {
		return 30;
	}

	@Override
	public String getTipoVehiculo() {
		return "turismo";
	}
	
	

}
