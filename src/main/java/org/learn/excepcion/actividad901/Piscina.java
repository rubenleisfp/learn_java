package org.learn.excepcion.actividad901;

public class Piscina {

    private int capacidadMaximaLitros;
    private int capacidadActual;

    public Piscina(int capacidadMaximaLitros) {
        this.capacidadMaximaLitros = capacidadMaximaLitros;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void anhadirLitros(int litros) throws PiscinaException {
        if (capacidadActual + litros > capacidadMaximaLitros) {
            throw new PiscinaException("No caben " + litros + " litros en la piscina");
        }
        capacidadActual += litros;
    }

    public void quitarLitros(int litros) throws PiscinaException {
        if (capacidadActual - litros < 0) {
            throw new PiscinaException("No caben " + litros + " litros en la piscina");
        }
        capacidadActual -= litros;
    }
}
