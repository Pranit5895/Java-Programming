package Employee;

import java.util.Scanner;

public class Employee {
	
	String name;
	int year_of_joining;
	String address;
	
	public void getInput() {
		 
		  Scanner in = new Scanner(System.in);
		  System.out.print("Enter the Employee Name :: ");
		  name = in.next();
		  System.out.print("Enter the year of joining  :: ");
		  year_of_joining = in.nextInt();
		  System.out.print("Enter the address of the employee :: ");
		  address = in.next();
		 }
		 
		 public void display() {
		  
		  System.out.println("Employee name = " + name);
		  System.out.println("Employee year of joining = " + year_of_joining);
		  System.out.println("Employee address = " + address);
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e[] = new Employee[3];
		  
		  for(int i=0; i<3; i++) {
		   
		   e[i] = new Employee();
		   e[i].getInput();
		  }
		  
		  System.out.println("**** Data Entered as below ****");
		  
		  for(int i=0; i<5; i++) {
		   
		   e[i].display();
		  }
		  

	}

}
