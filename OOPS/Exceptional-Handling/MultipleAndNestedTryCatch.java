package ExceptionHandling;

public class MultipleAndNestedTryCatch {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("Division ");
				int b=29/0;
				}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			
			try
			{
				int a[] = new int[5];
				a[5]=4;
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("Executed after Exceptions ");
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		
		System.out.println(" Code Done  ");
	}
}
