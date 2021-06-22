package InnerClasses;

abstract class Human
{
	abstract void eats();
}
public class Anonymous_Inner_Class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human() {
			void eats()
			{
				System.out.println("Humans Eat Food");
			}
		};
		h.eats();
	}
}
