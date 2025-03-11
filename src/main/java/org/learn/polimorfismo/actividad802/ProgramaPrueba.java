/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.learn.polimorfismo.actividad802;


import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author JoseManuel
 */
public class ProgramaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Detergente det1 = new Detergente("limpiamas",2.5);
        det1.setVolumen(33);
        det1.setDescuento(2);
        det1.setTipoEnvase("Botella de plástico pequeña");
        
        System.out.println(det1);
        
        Cereales cer1 = new Cereales("crunchy","Espelta",3);
        cer1.setCaducidad(LocalDate.of(2022, 8, 2));
        System.out.println("Calorías: "+cer1.getCalorias());
        
        System.out.println(cer1);
        
        Vino vin1 = new Vino("plimplar","tinto",12,8);
        vin1.setVolumen(330);
        vin1.setTipoEnvase("botella de cristal");
        vin1.setCaducidad(LocalDate.of(2023, 7, 12));
        vin1.setDescuento(5);
        
        System.out.println(vin1);
        
        
        ArrayList<EsAlimento> lista = new ArrayList<>();
        lista.add(vin1);
        lista.add(cer1);
        
        int totalcalorias = 0;
        for(EsAlimento alimento: lista) {
            totalcalorias += alimento.getCalorias();
        }
        
        System.out.println("Total calorias: "+totalcalorias);
        
        
        
        
    }
    
}
