package com.example.unit3;

@FunctionalInterface
interface A {
	void show();
}


//class B extends Object implements A {
//	@Override
//	public void show() {
//		System.out.println("Hi");
//	}
//}


public class LambdaExample1 {

	public static void main(String[] args) {
		
		A obj = () -> System.out.println("Hi");
		obj.show();
		
	}
	
}
