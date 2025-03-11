package org.learn.basico.actividad213;

public class SumaNPrimerosNumerosSoloPares {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
    	int num=5;
        int suma=0;
        
        int i=0;
        while(i<num) {
        	suma=suma+i;
        	i++;
        }
        System.out.println("suma:" + suma);
        
    }
}
