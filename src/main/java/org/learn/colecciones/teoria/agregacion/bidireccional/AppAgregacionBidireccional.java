package org.learn.colecciones.teoria.agregacion.bidireccional;

import java.util.ArrayList;
import java.util.List;

public class AppAgregacionBidireccional {
    public static void main(String[] args) {
        Profesor alberto = new Profesor(1,"Alberto");
        Profesor ruben = new Profesor(2, "Ruben");

        List<Profesor> profesores = new ArrayList<>();
        profesores.add(alberto);
        profesores.add(ruben);

        Departamento depInformatica = new Departamento("informatica",profesores);
        for (Profesor p : depInformatica.getProfesores()) {
            System.out.println(p);
        }

        alberto.setDepartamento(depInformatica);
        ruben.setDepartamento(depInformatica);

        //Ahora podemos navegar de un profesor a un departamento
        System.out.println(alberto.getDepartamento());

        for (Profesor profesor : alberto.getDepartamento().getProfesores()) {
            System.out.println("Profesores de departamento del profesor 1: " + profesor);
        }



    }
}
