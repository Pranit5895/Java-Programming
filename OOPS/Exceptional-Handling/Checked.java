package ExceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class Checked {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {97, 56, 789, 90, 127, 123, 575};
	      System.out.println("Elements in the array are:: ");
	      System.out.println(Arrays.toString(myArray));
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the index of the required element ::");
	      int element = sc.nextInt();
	      System.out.println("Element in the given index is :: "+myArray[element]);
	}
}
