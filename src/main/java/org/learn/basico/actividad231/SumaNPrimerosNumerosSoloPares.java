package org.learn.basico.actividad231;

public class SumaNPrimerosNumerosSoloPares {
    public static void main(String[] args) {
    	int num=20;
        int suma=0;
        
        int i=0;
        while(i<num) {
            if (i%2==0) {
                suma = suma + i;
            }
        	i++;
        }
        System.out.println("suma:" + suma);
        
    }
}
