package com.cg.day2;

public class ConstructorClass {
	//Default Constructor
	void print() {
		System.out.println("Normal Method ");
	}
	public ConstructorClass() {
		System.out.println("default constructor");
		System.out.println();
	}
	public ConstructorClass(int a) {
		System.out.println("parameterized constructor");
		System.out.println(a);
	}
	
}
