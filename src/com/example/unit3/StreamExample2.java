package com.example.unit3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(5, 6);
		map.put(4, 7);
		map.put(3, 8);
		map.put(2, 9);
		map.put(1, 10);
		
		map.forEach((k, v) -> System.out.println(k +" " + v));
		
		List<Integer> list = Arrays.asList(6, 5, 7, 2, 9);
		
		Predicate<Integer> predicate = n ->  n % 2 == 0;
		
		Function<Integer, Integer> function = t -> t * 2;
		
		int value = list.stream()
			.filter(predicate)
			.sorted()
			.map(function)
			.reduce(0, (c, e) -> c + e);
//		System.out.println(value);
		
//		Stream<Integer> data = list.stream();
//		Stream<Integer> mappedData = data.map(n -> n * 2);
//		mappedData.forEach(System.out::println);
		
//		for(int n : list) {
//			System.out.println(n * 2);
//		}
		
		
	}
		

}
