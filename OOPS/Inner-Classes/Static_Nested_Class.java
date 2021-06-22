package InnerClasses;

class outer1
{
	static int data = 30;
	static class inner
	{
		void message()
		{
			System.out.println("Data value is = "+data);
		}
	}
}
public class Static_Nested_Class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer1.inner obj = new outer1.inner();
		obj.message();

	}

}
