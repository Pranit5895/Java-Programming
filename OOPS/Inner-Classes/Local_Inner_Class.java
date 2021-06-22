package InnerClasses;

class local1
{
	private int b = 50;
	void display()
	{
		int value = 30;    //LOCAL VARIABLE ARE FINAL VARIABLES 
		class local
		{
			void message()
			{
				System.out.println("Value of variable is= "+value);
			}
		}
			local l = new local();
			l.message();
		}
	}
public class Local_Inner_Class {
	public static void main(String[] args) {
		local1 obj = new local1();
		obj.display();
	}
}
