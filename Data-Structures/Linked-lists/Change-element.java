// Java program to change elements  
// in a LinkedList  
    
import java.util.*;  
    
public class GFG {  
    
    public static void main(String args[])  
    {  
        LinkedList<String> ll = new LinkedList<>();  
    
        ll.add("Geeks");  
        ll.add("Geeks");  
        ll.add(1, "Geeks");  
    
        System.out.println("Initial LinkedList " + ll);  
    
        ll.set(1, "For");  
    
        System.out.println("Updated LinkedList " + ll);  
    }  
} 
