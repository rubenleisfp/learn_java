package org.learn.herencia.ejemplo.clase;


public class AppHerencia {
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        System.out.println(myCar.brand);
        //myCar.brand = "BMW";
        //System.out.println(myCar.brand);
        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);

        myCar.quienSoy();

    }
}