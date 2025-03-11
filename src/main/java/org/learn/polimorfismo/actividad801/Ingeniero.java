package org.learn.polimorfismo.actividad801;
public class Ingeniero extends Persona{
  public Ingeniero(String nombre) {
    super(nombre);
    
  }
  @Override
  public int correr() {
    
    return 3;
  }
}