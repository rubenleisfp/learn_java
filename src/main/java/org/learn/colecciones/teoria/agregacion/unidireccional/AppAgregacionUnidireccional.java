package org.learn.colecciones.teoria.agregacion.unidireccional;

import java.util.ArrayList;
import java.util.List;

public class AppAgregacionUnidireccional {
    public static void main(String[] args) {
        Profesor alberto = new Profesor(1, "Alberto");
        Profesor ruben = new Profesor(2,"Ruben");
        List<Profesor> profesores = new ArrayList<>();
        profesores.add(alberto);
        profesores.add(ruben);

        Departamento depInformatica = new Departamento("informatica",profesores);
        for (Profesor p : depInformatica.getProfesores()) {
            System.out.println(p);
        }

    }
}
