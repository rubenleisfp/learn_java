package org.learn.excepcion.teoria;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploBasicoExcepcion {

    public static void main(String[] args) {
        //Probamos todos los diversos casos. Playground
        int resultado = exceptionsBasics();
        System.out.println(resultado);

        //####### UNCHECKED ################
        uncheckedNumberFormat();
        int result;
        result = uncheckedArithmetic(100,2);
        System.out.println(result);
        result = uncheckedArithmetic(100,0);
        System.out.println(result);

        //####### CHECKED ################
        File file = new File("archivo.txt");
        checkedFile(file);

        try {
            checkedFileB(file);
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e);
        }
        //####### CUSTOME_EXCEPTIOn ################
        esMenor(17);
    }

    /**
     * Entender como funciona un try, catch y finally.
     *
     * Finally siempre se ejecuta
     *
     * @return
     */
    public static int exceptionsBasics() {
        int resultado=0;
        try {
            resultado = 100 / 10;
        } catch (ArithmeticException ex) {
            resultado = 3;
        } finally {
            resultado =12;
        }
        return resultado;
    }

    //Lanzamos una uncheckException, no hay que controlarla
    public static void esMenor(int edad) throws MenorEdadException {
        if (edad <18) {
            throw new MenorEdadException("No puedes pasar chorvito!");
        }
    }

    //Apertura de un fichero en Java8, hay que cerrarlo siemore en finally y controlar
    //una checkedException
    public static void checkedFile(File file) {
        //Antes de Java 8
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int a = 5 / 0;
        } catch (FileNotFoundException | ArithmeticException e) {
            System.out.println("Fichero no encontrado: " + e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    /**
     * A partir de Java8 podemos usar el try resources, Java cierra el fichero por nosotros
     * @param file
     */
    public static void checkedFilePostJava8(File file) {
        //Antes de Java 8
        try (FileReader fileReader = new FileReader(file)) {
            int a = 5 / 0;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Sino capturo una checkedException, estoy obligado a relanzarla y que se encargue
     * de ella quien me ha llamado
     * @param file
     * @throws FileNotFoundException
     */
    public static void checkedFileB(File file) throws FileNotFoundException {
        FileReader fileReader = new FileReader(file);
    }

    /**
     * UncheckedException, surge sino programo de forma defensiva
     * No estoy obligada a comprobarla
     */
    public static void uncheckedNumberFormat() {
        String palabra = "aida";
        boolean isNumeric = StringUtils.isNumeric(palabra);
        if (isNumeric) {
            int numero = Integer.parseInt(palabra);
            System.out.println(numero);
        } else {
            System.out.println("Castron, estás intentando convertir a numero una palabra");
        }
    }

    /**
     * UncheckedException, surge sino programo de forma defensiva
     * No estoy obligada a comprobarla
     */
    public static int uncheckedArithmetic(int dividendo, int divisor) {
        int resultado = 0;
        if (divisor != 0) {
            resultado = dividendo / divisor;
        }
        return resultado;
    }
}
