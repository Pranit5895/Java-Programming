package ExceptionHandling;

public class Chaining {
	static void demoproc() 
	{
		// create an exception
		NullPointerException e =
		new NullPointerException("top layer");
		// add a cause
		e.initCause(new ArithmeticException("cause"));
		throw e;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			demoproc();
		} 
		catch(NullPointerException e) 
		{
			// display top level exception
			System.out.println("Caught: " + e);
			// display cause exception
			System.out.println("Original cause: " +
			e.getCause());
		}

	}

}
