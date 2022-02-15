package jvmtool;

import java.util.HashMap;

public class JConsole {
	
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println(Long.MAX_VALUE);
		long cur = System.currentTimeMillis();
		HashMap map = new HashMap(10000);
		while(System.currentTimeMillis() - cur < 30 * 1000) {
		}
		System.out.println("**********************************");
		cur = System.currentTimeMillis();
		HashMap map2 = new HashMap(1000000);
		while(System.currentTimeMillis() - cur < 30 * 10000) {
		}
	}

}
