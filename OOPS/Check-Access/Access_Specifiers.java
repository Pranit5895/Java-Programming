package CheckAccess;

class DataMembers
{
	private int a=5;
	int b=10;
	protected int c=15;
	public int d=20;
	void printmembers()
	{
		System.out.println("Private= "+a);
		System.out.println("Default= "+b);
		System.out.println("Protected= "+c);
		System.out.println("Public= "+d);
	}
}

public class Access_Specifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataMembers dm = new DataMembers();
		//System.out.println("Private= "+dm.a);    (THIS CANNOT BE ACCESSED BECAUSE IT IS PRIVATE AND CANNOT BE ACCESSED OUTSIDE THE CLASS
		System.out.println("Default= "+dm.b);
		System.out.println("Protected= "+dm.c);
		System.out.println("Public= "+dm.d);
		

	}

}
