/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.learn.polimorfismo.actividad802;

/**
 *
 * @author JoseManuel
 */
public class Detergente implements EsLiquido, ConDescuento {

    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public void setVolumen(double v) {
        volumen = v;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
       tipoEnvase = env; 
    }

    @Override
    public String getTipoEnvase() {
       return tipoEnvase;
    }

    @Override
    public void setDescuento(double des) {
       descuento = des;
    }

    @Override
    public double getDescuento() {
       return descuento;
    }

    @Override
    public double getPrecioDescuento() {
       return precio - (precio * (descuento/100.0));
    }

    @Override
    public String toString() {
        return "Detergente{" + "marca=" + marca + ", precio=" + precio + 
                ", volumen=" + volumen + ", tipoEnvase=" + tipoEnvase + 
                ", descuento=" + descuento + 
                ", precio con descuento=" + getPrecioDescuento() + '}';
    }
    
    
    
    
}
