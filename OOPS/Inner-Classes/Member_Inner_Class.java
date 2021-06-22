package InnerClasses;

class outer
{
	private int a = 50;
	class inner
	{
		void message()
		{
			System.out.println("Variable value is = "+a);
		}
	}
}
public class Member_Inner_Class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer obj = new outer();
		outer.inner in = obj.new inner();
		in.message();
	}
}
