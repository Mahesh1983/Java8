package com.example.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
	public static void main(String[] args) {
		List<String> inList = new ArrayList<>(Arrays.asList("a","b","c"));
		List<String> outList = inList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		outList.stream().forEach(x -> System.out.print(x));
	}
}
