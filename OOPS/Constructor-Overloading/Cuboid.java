package ConstructorOverloading;

public class Cuboid {
	
	double width, height, depth; 
	
	Cuboid(double w, double h, double d) 
    { 
        width = w; 
        height = h; 
        depth = d; 
    } 
  
    // constructor used when no dimensions 
    // specified 
    Cuboid() 
    { 
        width = height = depth = 0; 
    } 
  
    // constructor used when cube is created 
    Cuboid(double len) 
    { 
        width = height = depth = len; 
    } 
  
    // compute and return volume 
    double volume() 
    { 
        return width * height * depth; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid mybox1 = new Cuboid(10, 20, 30); 
        Cuboid mybox2 = new Cuboid(); 
        Cuboid mycube = new Cuboid(9); 
  
        double vol; 
  
        // get volume of first box 
        vol = mybox1.volume(); 
        System.out.println(" Volume of mybox1 is " + vol); 
  
        // get volume of second box 
        vol = mybox2.volume(); 
        System.out.println(" Volume of mybox2 is " + vol); 
  
        // get volume of cube 
        vol = mycube.volume(); 
        System.out.println(" Volume of mycube is " + vol); 

	}

}
