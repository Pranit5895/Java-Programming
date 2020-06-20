import java.util.*; 
  
public class ListDemo { 
    public static void main(String[] args) 
    { 
        // Creating a list 
        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 1); // adds 1 at 0 index 
        l1.add(1, 2); // adds 2 at 1 index 
        System.out.println(l1); // [1, 2] 
