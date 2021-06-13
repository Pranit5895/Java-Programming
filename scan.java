import java.util.Scanner;

class scan{
public static void main(String[] args)
{
Scanner s1 = new Scanner(System.in);
String name = s1.nextLine();
int num = s1.nextInt();
long no = s1.nextLong();

System.out.println("Name:" + name);
System.out.println("Number:" + num);
System.out.println("Long mobile no is:" + no);
}
}
