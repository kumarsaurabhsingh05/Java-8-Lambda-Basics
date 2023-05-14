package com.example.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		Thread thread = new Thread(MethodReferenceExample1::printMessage); //() -> method()
		// MethodReferenceExample1::printMessage === () -> printMessage()
		thread.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
