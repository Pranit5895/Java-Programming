public class Demo
{
public static void main(String[] args)
{
Integer i = new Integer(2);
i = null;
System.gc();
System.out.println("In the Main Method");
}
protected void finalize()
{
System.out.println("object is garbage collected ");
}
}
