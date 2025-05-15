package com.for1.practice;

public class Test5 {
	public void EveryThirdNumber() {
		for(int i=5;i<=50;i=i+3) {
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		Test5 t1 = new Test5();
		t1.EveryThirdNumber();
	}
}
