package org.learn.colecciones.actividad501;

import java.util.HashMap;
import java.util.Map;
public class MapExample {
 
    public static void main(String args[]){  
        Map<Integer,String> mysubjects = new HashMap<Integer,String>();  
 
        //Add elements to map
        mysubjects.put(1,"Java");  
        mysubjects.put(2,"Spring");  
        mysubjects.put(3,"Oracle");  
 
        //Print map elements in key value form
        for(Map.Entry subject : mysubjects.entrySet()) 
           System.out.println(subject.getKey()+" - "+subject.getValue());


        String subject = mysubjects.get(2);
        System.out.println(subject);
 
    }  
}