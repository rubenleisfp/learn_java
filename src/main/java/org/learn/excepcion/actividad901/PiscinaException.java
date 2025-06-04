package org.learn.excepcion.actividad901;

public class PiscinaException extends Exception{

    private String mensaje;

    public PiscinaException(String mensaje) {
        super(mensaje);
    }
}
