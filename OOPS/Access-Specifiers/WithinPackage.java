class DataMembers1
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
public class WithinPackage {
	public static void main(String[] args) {
		DataMembers1 dm = new DataMembers1();
		//System.out.println("Private= "+dm.a);    (THIS CANNOT BE ACCESSED BECAUSE IT IS PRIVATE AND CANNOT BE ACCESSED OUTSIDE THE CLASS
		System.out.println("Default= "+dm.b);
		System.out.println("Protected= "+dm.c);
		System.out.println("Public= "+dm.d);
	}
}