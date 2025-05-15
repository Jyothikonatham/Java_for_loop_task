package com.for1.practice;

public class Test8 {
	public void cubeOfNumber(int base) {
		int res=1;
		for(int i=1;i<=base;i++) {
			res=i*i*i;
			System.out.println("The cube of "+i+" is: "+res);
		}
	}
	public static void main(String[] args) {
		Test8 t1 = new Test8();
		t1.cubeOfNumber(10);
		
	}
}
