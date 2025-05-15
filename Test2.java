package com.for1.practice;

public class Test2 {
	public void getMultiplesOfAnumber(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num*i);
		}
	}
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2. getMultiplesOfAnumber(7);
	}

}
