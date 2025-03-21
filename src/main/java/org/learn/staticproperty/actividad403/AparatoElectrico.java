package org.learn.staticproperty.actividad403;
public class AparatoElectrico {
    
    static double consumoTotal =0;
    private double potencia;
    private boolean encendido;
    
    public AparatoElectrico(double potencia) {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }
    
    static double consumo(){
        return consumoTotal;
    }
    
    void enciende(){
        throw new UnsupportedOperationException("A implementar por el alumno");
    }
    void apaga(){
        throw new UnsupportedOperationException("A implementar por el alumno");
    }
    

}
