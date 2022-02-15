package jdk.javagrammar;

public class StaticDomain {
	
	public static A a = null;
	
	public static void init(int aa) {
		a = new A();
		a.a = aa;
	}
	
	public static int getAa() {
		return a.a;
	}

}

class A{
	public int a;
}