// Another Java program to demonstrate 2-D jagged  
// array such that first row has 1 element, second 
// row has two elements and so on. 
class Main 
{ 
    public static void main(String[] args) 
    { 
        int r = 5; 
  
        // Declaring 2-D array with 5 rows 
        int arr[][] = new int[r][]; 
  
        // Creating a 2D array such that first row 
        // has 1 element, second row has two  
        // elements and so on. 
        for (int i=0; i<arr.length; i++) 
            arr[i] = new int[i+1]; 
  
        // Initializing array 
        int count = 0; 
        for (int i=0; i<arr.length; i++) 
            for(int j=0; j<arr[i].length; j++) 
                arr[i][j] = count++; 
  
        // Displaying the values of 2D Jagged array 
        System.out.println("Contents of 2D Jagged Array"); 
        for (int i=0; i<arr.length; i++) 
        { 
            for (int j=0; j<arr[i].length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        } 
    } 
} 
