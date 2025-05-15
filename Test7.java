package com.for1.practice;

public class Test7 {
	public void NotDivisibleByFour() {
		for(int i=1;i<=100;i++) {
			if(i%4!=0) {
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Test7 t1 = new Test7();
		t1.NotDivisibleByFour();
	}

}
