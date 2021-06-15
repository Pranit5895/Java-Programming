package ExceptionHandling;

public class Finally {
	public static void main(String[] args) {
		try
		{
			int data = 30/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Block is always executed");
		}
		System.out.println("Code Done");
	}
}
