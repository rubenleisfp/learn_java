package org.learn.colecciones.teoria.agregacion.bidireccional;

import java.util.ArrayList;
import java.util.List;

public class AppAgregacionBidireccional {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor(1,"Alberto");
        Profesor profesor2 = new Profesor(2, "Ruben");
        List<Profesor> profesores = new ArrayList<>();
        profesores.add(profesor1);
        profesores.add(profesor2);

        Departamento depInformatica = new Departamento("informatica",profesores);
        for (Profesor p : depInformatica.getProfesores()) {
            System.out.println(p);
        }

        profesor1.setDepartamento(depInformatica);
        profesor2.setDepartamento(depInformatica);

        //Ahoran podemos navegar de un profesor a un departamento
        System.out.println(profesor1.getDepartamento().toString());

        for (Profesor profesor : profesor1.getDepartamento().getProfesores()) {
            System.out.println("Profesores de departamento del profesor 1: " + profesor);
        }



    }
}
