package com.cg.day2;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		ConstructorClass obj = new 	ConstructorClass();
		System.out.println("Main class");
		obj.print();
		System.out.println();
		ConstructorClass obj1 = new ConstructorClass(6);
	}
}