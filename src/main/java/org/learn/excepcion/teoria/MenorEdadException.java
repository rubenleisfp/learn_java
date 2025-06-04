package org.learn.excepcion.teoria;

public class MenorEdadException extends RuntimeException{

    private String mensaje;

    public MenorEdadException(String mensajeArg) {
        super();
        mensaje = mensajeArg;

    }
}
