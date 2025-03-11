package org.learn.polimorfismo.actividad801;
public class Principal {
  public static void main(String[] args) {
  
    
    Ingeniero i= new Ingeniero("pedro");
    Deportista d= new Deportista("gema");
    
    System.out.println(i.correr());
    System.out.println(d.correr());
    
    
  }
}