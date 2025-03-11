package org.learn.basico.actividad213;

public class SumaNPrimerosNumerosWhile {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
    	int num=5;
        int suma=0;
        
        int i=0;
        while(i<num) {
        	if (i%2==0) {
        		suma=suma+i;
        	}
        	i++;
        }
        System.out.println("suma:" + suma);
        
    }
}
