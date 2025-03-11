/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.learn.polimorfismo.actividad802;

import java.time.LocalDate;

/**
 *
 * @author JoseManuel
 */
public interface EsAlimento {
    public void setCaducidad(LocalDate fc);
    public LocalDate getCaducidad();
    public int getCalorias();
}
