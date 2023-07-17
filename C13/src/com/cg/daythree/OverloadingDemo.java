package com.cg.daythree;

public class OverloadingDemo {

	public static void main(String[] args) {
		methodoverloading ml = new 	methodoverloading();
		System.out.println(ml.add(2, 40));
		System.out.println(ml.add(2.5f, 3.5f));
		System.out.println(ml.add(2.5,2.4));
		System.out.println(ml.sub(5, 4));
		System.out.println(ml.sub(7f, 2f));
		System.out.println(ml.sub(3.3,2.1));
		System.out.println(ml.mul(4, 2));
		System.out.println(ml.mul(4.2f, 2.2f));
		System.out.println(ml.mul(3.0, 2.0));
		System.out.println(ml.div(6, 2));
		System.out.println(ml.div(5.0f, 2.5f));
		System.out.println(ml.div(12.0, 6.0));
		System.out.println(ml.mod(10, 2));
		System.out.println(ml.mod(20.0f, 10.0f));
		System.out.println(ml.mod(15.5, 5.0));
		
		

	}

}
