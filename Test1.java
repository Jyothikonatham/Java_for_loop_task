package com.for1.practice;

public class Test1 {
	public void printDivisibleByThreeAndFive() {
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.printDivisibleByThreeAndFive();
	}

}
