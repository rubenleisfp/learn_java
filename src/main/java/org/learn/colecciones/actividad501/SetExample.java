package org.learn.colecciones.actividad501;

import java.util.HashSet;
import java.util.Set;
public class SetExample {
 
    public static void main(String args[]){  
        //Create Set object
        Set<String> mySubjects = new HashSet<>();  
 
        //Add elements to Set
        mySubjects.add("Java");  
        mySubjects.add("Spring");  
        mySubjects.add("Hibernate");
        mySubjects.add("Spring");

        System.out.println("My Subjects:"); 
        //Print all subjects
        for(String subject : mySubjects){  
         System.out.println(subject);  
        }
 
    }  
}