package jdk;

public class StaticClass {
	
	public static void main(String[] args) {
		A a = new A();
		a.a = 2;
		
		System.out.println(a.a);
	}
	
	public static class A {
		public int a = 1;
	}
}
