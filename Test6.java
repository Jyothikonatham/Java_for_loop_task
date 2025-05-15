package com.for1.practice;

public class Test6 {
	public void ReverseMultiplication(int num) {
		for(int i=10;i>=1;i--) {
			System.out.println(num +"*"+ i + "="+ num*i);
		}
	}
	public static void main(String[] args) {
		Test6 t1 = new Test6();
		t1.ReverseMultiplication(6);
	}
}
