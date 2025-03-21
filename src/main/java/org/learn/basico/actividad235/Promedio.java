package org.learn.basico.actividad235;
import java.util.Scanner;

public class Promedio {
 
 public static void main(String[] args) {
  // Create a Scanner object to read input from the user
  Scanner in = new Scanner(System.in);
   
  // Prompt the user to input the first number
  System.out.print("Primer numero: ");
  
  // Read and store the first number
  int num1 = in.nextInt();
   
  // Prompt the user to input the second number
  System.out.print("Segundo numero: ");
  
  // Read and store the second number
  int num2 = in.nextInt();
   
  // Prompt the user to input the third number
  System.out.print("Tercer numero: ");
  
  // Read and store the third number
  int num3 = in.nextInt();
   

   
  // Calculate and print the average of the five numbers
  System.out.println("Promedio: " + (num1 + num2 + num3) / 3);
 }
} 