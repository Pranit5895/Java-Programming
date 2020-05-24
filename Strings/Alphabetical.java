import java.util.Scanner;
public class JavaExample
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
	//User will be asked to enter the count of strings
        System.out.print("Enter number of strings you would like to enter:");
        count = scan.nextInt();


        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
