package org.learn.basico.actividad264;

public class CadenaReves {
    public static void main(String[] args) {
        System.out.println(cadenaReves("hola"));
    }

    private static boolean cadenaReves(String hola) {
        char[] chars = hola.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return hola.equals(new String(chars));
    }
}
