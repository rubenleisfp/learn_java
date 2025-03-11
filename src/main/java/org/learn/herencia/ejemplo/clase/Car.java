package org.learn.herencia.ejemplo.clase;

class Car extends Vehicle {
  public String modelName = "Mustang";

  // Car attribute

  public void quienSoy() {
    System.out.println("Soy un coche, que heredo de vehiculo");
  }
}