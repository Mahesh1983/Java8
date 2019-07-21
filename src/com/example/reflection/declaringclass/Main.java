package com.example.reflection.declaringclass;

import java.lang.reflect.Field;

/**
 * Reflection example to identify declaring class name
 * @author Home
 *
 */

public class Main {

	public static void main(String[] args) {
		
//		A a = new A();
		Field field [] = A.class.getFields();
		/*System.out.println("Size :: " + field.length);
		for(Field f : field)
		{
			System.out.println("Field Name ::" + f.getName() + "  Class Name :: " + f.getDeclaringClass().getName());
		}*/
		
		Parent p = new A();
		Field field1 [] = p.getClass().getDeclaredFields();
		for(Field f : field1)
		{
			System.out.println("Field Name ::" + f.getName() + "  Class Name :: " + f.getDeclaringClass().getName());
		}
	}
}