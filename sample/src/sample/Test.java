package sample;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		int a = 1;
		System.out.println(a);
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("arun");
		b.add("bala");
		b.add("chandru");
		
		for(String c : b) {
			System.out.println(c);
		}
		
	}

}
