package com.example.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.example.unit1.Person;

public class StandardFunctionalInterfaceExample {
	public static <T> void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Ashutosh", "Yadav", 27),
				new Person("Deepak", "Singh Kushwaha", 27),
				new Person("Rohit", "Kumar Pandey", 29),
				new Person("Saurabh", "Kumar Singh", 26),
				new Person("Ashish", "Ranjan", 23)
		);
		
		
		// Step 1 : to sort list by lastName (in java 7)
		
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		
		// Step 2 : Create a method that prints all the elements in the list
		
		System.out.println("Printing all persons");
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		// Step 3 : Create a method that prints all people that have last name beginning with K
		
		System.out.println("Printing all persons with last name begining with K");
		performConditionally(people, p -> p.getLastName().startsWith("K"), p -> System.out.println(p));
		
		System.out.println("Printing all persons with first begining with name A");
		performConditionally(people, p -> p.getFirstName().startsWith("A"), p -> System.out.println(p.getFirstName()));
	}
	
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}			
		}
	}
}
