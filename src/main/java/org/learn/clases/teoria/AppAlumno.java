package org.learn.clases.teoria;

public class AppAlumno {
    public static void main(String[] args) {

        //En Java se crean objetos con new
        String texto = new String("hola");
        //String es un caso peculiar donde no es necesario
        String texto2 = "hola";

        Alumno juan = new Alumno(11,"Juan",20);
        System.out.println("Juan: :" + juan);
        Alumno iago = new Alumno(7, "Iago",42);
        System.out.println("Iago: :" + iago);
        //A Aida la creo con el constructor vacio y luego establezco sus valores
        Alumno aida = new Alumno();
        aida.setId(2);
        aida.setNombre("Aida");
        aida.setEdad(25);

        //Creo un array de 4 posiciones, dónde meto los alumnos anteriores y a Borja en la posicion 4
        Alumno alumnos[] = new Alumno[4];
        alumnos[0] = juan;
        alumnos[1] = aida;
        alumnos[2] = iago;
        alumnos[3] = new Alumno(64,"Borja", 24);

        //Dos formas de recorrer un array
        System.out.println("Alumnos de mi array:");
        for (int i=0; i<alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }
        for (Alumno al : alumnos) {
            System.out.println(al);
        }

        //Para nota ;) Creamos una herencia de alumno, un alumno repetidor que tiene un nuevo atributo, aniosRepetidos
        AlumnoRepetidor ruben = new AlumnoRepetidor(6, "Ruben",23,10 );
        System.out.println(ruben);

    }
}
