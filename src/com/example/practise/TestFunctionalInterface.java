package com.example.practise;

@FunctionalInterface
public interface TestFunctionalInterface {

	public void testInterface();

	default void display()
	{
		System.out.println("Display");
	}
	
	static void display1()
	{
		System.out.println("Display");
	}
}
