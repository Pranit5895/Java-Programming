public class que5 {
	public static void main(String[] args) {
		// Integer to int
		Integer num = new Integer(20);
		System.out.println(num.intValue());
		// int to String
		int c = 1234;
		String string = String.valueOf(c);
		System.out.println("String = " + string);
		String str = "123";
		int inum = 100;

		int inum2 = Integer.parseInt(str);

		int sum = inum + inum2;
		System.out.println("Result is: " + sum);
	}
}
