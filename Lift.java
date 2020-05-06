//There are n floors in BH3 and only 2 lifts. Initially Lift A is at the ground floor and Lift B at the top floor. Whenever someone calls the lift from N th floor, the lift closest to that floor comes to pick him up. If both the lifts are at equidistant from the N th floor, them the lift from the lower floor comes up.

//INPUT

//First line contains a integer T denoting the number of test cases.

//Next T lines contains a single integer N denoting the floor from which lift is called.

//OUTPUT

//Output T lines containing one character "A" if the first lift goes to N th floor or "B" for the second lift.

//CONTRAINTS

//0 <= N <= n

//1 <= T <= 100000

//Explanation
//3rd floor calls, Lift A(0) goes there.

//5th  floor calls, Lift A(3) and Lift B(7) are equidistant from 5, so Lift from l//owest floor goes there i.e. A.

import java.util.Scanner

public class lift{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Etner the max no of floors:- ");
		int tf=in.nextInt();
		int A=0,B=tf;
		System.out.println("Enter the number of test cases that you want to run");
		int test = in.nextInt();

		for (int i = 0; i < test; i++) {
			lift_function(lift_A, lift_B, top_floor);
		}
	
	}
	public static void lift_function(int A, int B, int tf)
{
	Scanner inp=new Scanner(System.in);
	System.out.println("Which floor :- ");
	int call=inp.nextInt();
	if(call<=tf) {
		if(call>A && call<B) {
			if(call-A < B-call) {
				System.out.println("Lift");
				A=call;
			}
			else if(call-A > b-call) {
				system.out.ptintln("Lift");
				A=call;
			}
		}
		else if(call>A && call>B) {
			if(a-call< call-b){
				system.out.println("Lift");
				A=call;
			}
			else if (A-call > call-B) {
				System.out.println("Lift");
				B=call;
			}
			else {
				System.out.println("Lift");
				A=call;
			}
		}
	}
	else {
		System.out.println("Invalid floor");
	}
}
}
