package com.example.practise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(10);
		list.add(25);
		list.add(5);
		System.out.println(list.stream().min(Comparator.naturalOrder()));
	}

}
