package javadesignpattern.creational;

public class Singleton {
	
	private static Singleton s;
	
	private Singleton() {
		System.out.println("generator");
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
	
	public void doSomeThings() {
		System.out.println("work");
	}
	
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.doSomeThings();
	}

}
