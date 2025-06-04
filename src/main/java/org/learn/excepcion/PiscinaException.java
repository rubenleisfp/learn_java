package org.learn.excepcion;

public class PiscinaException extends Exception{

    private String mensaje;

    public PiscinaException(String mensaje) {
        super(mensaje);
    }
}
