package org.learn.polimorfismo.actividad801;
public abstract class Persona {
  private String nombre;
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public Persona(String nombre) {
    super();
    this.nombre = nombre;
  }
  
  public abstract int  correr() ;
}