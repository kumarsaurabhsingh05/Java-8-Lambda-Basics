package com.example.unit3;

import java.util.Arrays;
import java.util.List;

import com.example.unit1.Person;

public class CollectionIterationExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Ashutosh", "Yadav", 27),
				new Person("Deepak", "Singh Kushwaha", 27),
				new Person("Rohit", "Kumar Pandey", 29),
				new Person("Saurabh", "Kumar Singh", 26),
				new Person("Ashish", "Ranjan", 23)
		);	
		
		System.out.println("Using for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for each loop");
		for (Person person : people) {
			System.out.println(person);
		}
		
		System.out.println("Using lambda method referance for each loop");
		people.forEach(System.out::println);
		
	}
}
