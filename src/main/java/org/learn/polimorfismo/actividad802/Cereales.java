/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.learn.polimorfismo.actividad802;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 
 */
public class Cereales implements EsAlimento {

    private String marca;
    private String tipoCereal;
    private double precio;
    private LocalDate caducidad;

    public Cereales(String marca, String tipoCereal, double precio) {
        this.marca = marca;
        this.tipoCereal = tipoCereal;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    @Override
    public void setCaducidad(LocalDate fc) {
        caducidad = fc;     
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        if(tipoCereal.equalsIgnoreCase("espelta")) {
            return 5;
        } else if(tipoCereal.equalsIgnoreCase("maíz")) {
            return 8;
        } else if(tipoCereal.equalsIgnoreCase("trigo")) {
            return 12;
        } else {
            return 15;
        }
    }

    @Override
    public String toString() {
        return "Cereales{" + "marca=" + marca + ", tipoCereal=" + tipoCereal + ", precio=" + precio +
                ", caducidad=" + caducidad.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", calorías=" + getCalorias() + '}';
    }
    
    
    
}
