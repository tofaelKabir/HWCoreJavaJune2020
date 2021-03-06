package exam_oop;

/*
04) Now think about a regular class Iphone1. Create a method - regularClassInfo and print out all the features of a regular class compared with Interface and Abstract class you know. what is the relation between regular class, Abstract class and Interface? Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Write code after answering above]. [points: 30] .
 
05) Assume 4 private variable name price (as int), Info (as String, write few words when you bought it), user (as a char, M or F), madeInUSA (as boolean) inside Iphone1 class. If the variables are private how can you use those variable? What kind of concept you can use? use it just after the variables. Now print out in TestPhone: "I bought this phone in 2000, the price was 750$, user's sex: <put your sex initial> and boolean value for made in USA is: false". [points: 30] . 
 * */

public class Iphone1 extends AppleWatch implements Phone {

	private int price;
	private String Info;
	private char user;
	private boolean madeInUSA;

	public final String family = "Apple Family";

	public Iphone1() {
		System.out.println("Default constructor of Iphone1");
	}

	public Iphone1(int price, String info, char grade, boolean madeInUSA) {
		this.price = price;
		this.Info = info;
		this.user = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Iphone info: price - $" + price + ", model - " + info + ", grade - " + grade
				+ ", Is it made in USA - " + madeInUSA);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public void regularClassInfo() {
		System.out.println("A regular class can extends (only one) abstract class or a regular class. It can implements (more than one) Interface. Here Iphone1 is called a concrete class. By default methods are non abstract");
	}

	@Override
	public void pager() {
		System.out.println("pager method is implemented");

	}

	@Override
	public void wakitaki() {
		System.out.println("wakitaki method is implemented");

	}

	@Override
	public void interfaceInfo() {
		System.out.println("In interface, the methods are abstract and can be declared, not implemented. An interface can extends more than one Interface but can't implement anyone. From Java 1.8, only default and static method can be implemented. Variables declared in a Java interface are by default final. We can't creat constructor inside Interface");

	}

	@Override
	public void call() {
		System.out.println("Call by Iphone is crystal clear");

	}

	@Override
	public void message() {
		System.out.println("Iphone have imessage");

	}

	@Override
	public void camera() {
		System.out.println("Iphone have high resolution camera");

	}

	@Override
	public void watch() {
		System.out.println("watch method from Watch Interface");

	}

	@Override
	public void digitalWatch() {
		System.out.println("digitalWatch method from DigitalWatch Interface");

	}

	@Override
	public void appleWatchInfo() {
		System.out.println("Abstract method is declared in Abtract Class, but non-abstract method is implemented");

	}
	
	public void compass() {
		System.out.println("Compass method from Iphone1 class");
	}

}
