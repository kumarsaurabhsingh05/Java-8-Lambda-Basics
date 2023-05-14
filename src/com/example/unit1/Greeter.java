package com.example.unit1;

public class Greeter {

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		Greeting lambdaFunction = () -> System.out.println("Hello World");
		
		Greeting innerClassGreeting = new Greeting() {
					public void perform() {
						System.out.println("Hello World");
					}
		};
		
		greeter.greet(lambdaFunction);
		greeter.greet(innerClassGreeting); 
		
	}
	
	
	public void greet(Greeting greeting) {
		greeting.perform();
//		System.out.println("Hello World!");
	}
}
