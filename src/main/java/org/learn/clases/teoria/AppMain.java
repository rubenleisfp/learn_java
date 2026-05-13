package org.learn.clases.teoria;

public class AppMain {

    public static void main(String[] args) {


        Alumno miguel = new Alumno(43);
        miguel.setNombre("Migui");
        miguel.setApellido("Souto");
        miguel.setEdad(43);

        System.out.println(miguel);

        Alumno hugo= new Alumno(22);
        hugo.setNombre("Manjainas");
        hugo.setApellido("Villar");
        System.out.println(hugo);

       Alumno ruben = new Alumno(43);
       ruben.setNombre("Pataka");
       ruben.setApellido("Leis");

       System.out.println(ruben);

        System.out.println(Alumno.getNumero());
        System.out.println(miguel.getNombreCompleto());
    }
}
