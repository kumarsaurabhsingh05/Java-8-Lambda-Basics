package com.example.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEach {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6, 5, 7, 2, 9);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for(int n :list) {
			System.out.println(n);
		}
		System.out.println();
		
		Consumer<Integer> consumer = System.out::println;
			
		
		list.forEach(consumer);
		
	}

}
