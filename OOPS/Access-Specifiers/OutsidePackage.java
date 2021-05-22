class DataMembers2
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
public class OutsidePackage {
	public static void main(String[] args) {
		DataMembers2 dm2 = new DataMembers2();
		//  System.out.println("Private= "+dm2.a);     CANNOT BE ACCESSED BECAUSE OUTSIDE PACKAGE ONLY PUBLIC DATA MEMBERS ARE ACCESSIBLE
		//  System.out.println("Default= "+dm2.b);
		//  System.out.println("Protected= "+dm2.c);
		System.out.println("Public= "+dm2.d);
	}
}
