package org.learn.file.binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryFile {

    /**
     * Escribe una lista de productos en un fichero
     *
     * @param filePath  ruta del fichero que deseamos crear
     * @param productos lista de productos a volcar en el fichero
     */
    public static void escribirBinario(String filePath, List<Producto> productos) {
        try (ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream(filePath))) {
            serializador.writeObject(productos);
        } catch (IOException ioe) {
            System.out.println("Error escribiendo en el fichero " + ioe);
        }
    }

    /**
     * Devuelve una lista de productos a partir de un fichero binario
     *
     * @param filePath ruta del fichero a leer
     * @return
     */
    public static List<Producto> leerBinario(String filePath) {
        List<Producto> listaProductos = null;
        try (ObjectInputStream deserializador = new ObjectInputStream(new FileInputStream(filePath))) {
            listaProductos = (ArrayList<Producto>) deserializador.readObject();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error fichero no encontrado" + fnfe);
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error en la clase de serializacion/deserializacion" + cnfe);
        } catch (IOException ioe) {
            System.out.println("Error intentanto leer el fichero" + ioe);
        }
        return listaProductos;
    }


    public static void main(String[] args) {
        String filePath = "src/main/resources/binary/productos.dat";
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("compresas", 30.0));
        productos.add(new Producto("bici", 600.0));
        escribirBinario(filePath,productos);

        List<Producto> productosLeidosList = leerBinario(filePath);
        for (Producto p: productosLeidosList) {
            System.out.println(p);
        }
    }
}
