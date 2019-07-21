package com.example.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap
{
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(3);
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(3);
		l2.add(4);
		
		Stream.of(l1, l2).flatMap(number -> number.stream()).forEach(number -> System.out.print(number + ", "));
	}
}
