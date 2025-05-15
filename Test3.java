package com.for1.practice;

public class Test3 {
	public void EvenNumberCount() {
		int count=0;
		for(int i=2;i<=50;i++) {
			if(i%2==0) {
				count=count+1;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Test3 t1 = new Test3();
		t1.EvenNumberCount();
	}

}
