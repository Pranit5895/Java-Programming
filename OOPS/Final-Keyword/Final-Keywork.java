package FinalKeyword;

public class FinalKeyword {
	   final int MAX_VALUE;
	   FinalKeyword(){
	      //It must be initialized in constructor
	      MAX_VALUE=100;
	   }
	   void myMethod(){  
		  System.out.println("Value of Max Value - ");
	      System.out.println(MAX_VALUE);
	   }  
	public static void main(String[] args) {
		FinalKeyword obj=new  FinalKeyword();  
	      obj.myMethod();
	}
}
