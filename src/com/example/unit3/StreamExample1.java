package com.example.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.example.unit1.Person;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Ashutosh", "Yadav", 27),
				new Person("Deepak", "Singh Kushwaha", 27),
				new Person("Rohit", "Kumar Pandey", 29),
				new Person("Saurabh", "Kumar Singh", 26),
				new Person("Ashish", "Ranjan", 23)
		);
		
//		people.stream()
//				.filter(p -> p.getLastName().startsWith("K"))
//				.forEach(p -> System.out.println(p.getFirstName()));
		
		long count = people.parallelStream()
				.filter(p -> p.getLastName().startsWith("Y"))
				.count();
		
		System.out.println(count);
		
	}

}
