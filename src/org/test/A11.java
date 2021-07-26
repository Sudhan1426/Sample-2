package org.test;

public class A11 {
	
	public static void main(String[] args) {
		
		int a[]=new int[5];
		a[0]=10;
		a[1]=50;
		a[2]=40;
		a[3]=20;
		a[4]=30;
		
		System.out.println(a[3]);
	    
		System.out.println("Normal for loop");
		for (int i = 0; i<5; i++) {
		System.out.println(a[i]);
		}	
		System.out.println("Enhanced for loop");
		for (int x : a) {
			System.out.println(x);
		}
			
	}

}
