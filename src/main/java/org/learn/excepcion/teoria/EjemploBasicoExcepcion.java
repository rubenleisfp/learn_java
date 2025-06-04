package org.learn.excepcion.teoria;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploBasicoExcepcion {

    public static void main(String[] args) {

//        uncheckedNumberFormat();
//        int result;
//        result = uncheckedArithmetic(100,2);
//        System.out.println(result);
//        result = uncheckedArithmetic(100,0);
//        System.out.println(result);

//        File file = new File("archivo.txt");
//        checkedFile(file);
//
//        try {
//            checkedFileB(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("Fichero no encontrado: " + e);
//        }

//        int resultado = exceptionsBasics();
//        System.out.println(resultado);
//          esMenor(17);
    }

    public static void esMenor(int edad) throws MenorEdadException {
        if (edad <18) {
            throw new MenorEdadException("No puedes pasar chorvito!");
        }
    }

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

    public static void checkedFilePostJava8(File file) {
        //Antes de Java 8
        try (FileReader fileReader = new FileReader(file)) {
            int a = 5 / 0;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void checkedFileB(File file) throws FileNotFoundException {
        FileReader fileReader = new FileReader(file);
    }


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

    public static int uncheckedArithmetic(int dividendo, int divisor) {
        int resultado = 0;
        if (divisor != 0) {
            resultado = dividendo / divisor;
        }
        return resultado;
    }


}
