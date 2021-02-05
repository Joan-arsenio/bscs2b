import java.io.*; 

import java.util.List; 

import java.util.ArrayList; 

  

class GFG { 

    public static void main(String[] args) 

    { 

        List<Integer> al = new ArrayList<Integer>(); 

        al.add(02); 

        al.add(12); 

        al.add(110); 

        al.add(35); 

  

        Object[] objects = al.toArray(); 

  

        // Printing array of objects 

        for (Object obj : objects) 

            System.out.print(obj + " "); 

    } 
}