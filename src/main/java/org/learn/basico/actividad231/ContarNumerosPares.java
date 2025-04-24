package org.learn.basico.actividad231;

public class ContarNumerosPares {
    public static void main(String[] args) {
    	int maximo=20;
        int numerosPares=0;
        
        int i=0;
        while(i<maximo) {
            if (i%2==0) {
                numerosPares++;
            }
        	i++;
        }
        System.out.println("numeroPares:" + numerosPares);
        
    }
}
