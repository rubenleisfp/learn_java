package org.learn.staticproperty.actividad403;
public class AparatoElectrico {
    
    static double consumoTotal =0;
    private double potencia;
    private boolean encendido;
    
    public AparatoElectrico(double potencia) {
        this.potencia = potencia;
        encendido=false;
    }
    
    static double consumo(){
        return consumoTotal;
    }
    
    void enciende(){
        if(!encendido){
            encendido=true;
            consumoTotal+=potencia;
        }
    }
    void apaga(){
        if(encendido){
            encendido= false;
            consumoTotal-=potencia;
        }
    }
    

}
