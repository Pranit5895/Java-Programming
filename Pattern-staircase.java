//Q2) Task to will be that you have to genrate a staircase patter by taking (n) as input and where n=lenght of the stair case 
//for EX:- n=6 so   # 
//                 ## 
//                ### 
//               #### 
//              ##### 
//             ######

import java.util.Scanner;
public class Staircase
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		Sysytem.out.println("Enter the height of Staircase: ");
		int height = scan.nextInt();   //Input for height of staircase

		int c=height-1;
