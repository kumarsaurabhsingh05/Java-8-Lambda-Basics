package com.example.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static <T> void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Ashutosh", "Yadav", 27),
				new Person("Deepak", "Singh Kushwaha", 27),
				new Person("Rohit", "Kumar Pandey", 29),
				new Person("Saurabh", "Kumar Singh", 26),
				new Person("Ashish", "Ranjan", 23)
		);
		
		
		// Step 1 : to sort list by lastName (in java 7)
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {				
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		// Step 2 : Create a method that prints all the elements in the list
		
		System.out.println("Printing all persons");
		printAll(people);
		
		// Step 3 : Create a method that prints all people that have last name beginning with K
		
//		printLastNameBeginingWith(people);
		
		
		System.out.println("Printing all persons with last name begining with K");
		printConditionally(people, new Condition() {
				@Override
				public boolean test(Person p) {
					return p.getLastName().startsWith("K");
				}
		});
		
		
		System.out.println("Printing all persons with first begining with name A");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("A");
			}
	});
		
		
	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}			
		}
	}
	
	
	private static void printLastNameBeginingWith(List<Person> people) {
		for(Person p : people) {
			if(p.getLastName().startsWith("K")) {
				System.out.println(p);
			}			
		}
	}


	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}
	}

}

interface Condition{
	boolean test(Person p);
}
