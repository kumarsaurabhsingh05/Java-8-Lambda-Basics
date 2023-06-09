package com.example.unit2;

public class ThisReferenceExample {
	
	public static void main(String[] args) {
		
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		
		/*
		thisReferenceExample.doProcess(10, (int i) -> {
				System.out.println("Value of i is : " + i);
//				System.out.println(this); // this will not work
			});
		*/
		
		thisReferenceExample.execute();
		
		
	}
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	public void execute() {
		
		doProcess(10, (int i) -> {
			System.out.println("Value of i is : " + i);
			System.out.println(this);
		});
		
	}
	
	public String toString() {
		return "This is the main ThisReferenceExample class instance";
	}

}
