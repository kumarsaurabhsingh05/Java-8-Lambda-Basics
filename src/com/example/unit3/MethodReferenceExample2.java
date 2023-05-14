package com.example.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.example.unit1.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Ashutosh", "Yadav", 27),
				new Person("Deepak", "Singh Kushwaha", 27),
				new Person("Rohit", "Kumar Pandey", 29),
				new Person("Saurabh", "Kumar Singh", 26),
				new Person("Ashish", "Ranjan", 23)
		);
		
		
		System.out.println("Printing all persons");
		performConditionally(people, p -> true, System.out::println); // p -> method()
		
		
	}
	
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}			
		}
	}

}
