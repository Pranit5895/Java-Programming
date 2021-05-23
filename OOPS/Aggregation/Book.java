class Author
{
  String authorName;
  int age;
  String place;
  // Author class constructor
  Author(String name, int age, String place)
  {
    authorName = name;
    this.age = age;
    this.place = place;
  }
}
public class Book {   
	  String name;
	  int price;
	  // author details
	  Author auther;
	  Book(String n, int p, Author auther)
	  {
	    name = n;
	    price = p;
	    this.auther = auther;
	  }
	public static void main(String[] args) {
		Author auther = new Author("Pranit Gupta", 20, "DELHI");
	    Book b = new Book("CODING IS FUN", 10000, auther);
	    System.out.println("Book Name: "+b.name);
	    System.out.println("Book Price: "+b.price);
	    System.out.println("------------Auther Details----------");
	    System.out.println("Auther Name: "+b.auther.authorName);
	    System.out.println("Auther Age: "+b.auther.age);
	    System.out.println("Auther place: "+b.auther.place);
	}
}
