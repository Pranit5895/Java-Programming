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
public class WithinClass {
	public static void main(String[] args) {
		DataMembers dm = new DataMembers();     //THIS WILL PRINT ALL THE DATA MEMBERS SINCE WE ARE ACCESSING THEM WITHIN THE CLASS USING OBJECTS 
		dm.printmembers();
	}
}
