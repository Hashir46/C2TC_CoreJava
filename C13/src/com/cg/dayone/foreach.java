package com.cg.dayone;

public class foreach {

	public static void main(String[] args) {
		// foreach
		int a[] = {10,20,30,40,50};
		for(int i:a) {
			System.out.println(i);	
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}


	}

}
