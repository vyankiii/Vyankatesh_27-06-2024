package com.javaListCollections;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();//10
		
		list.add(new Student(101, "Ajay"));
		list.add(new Student(104, "Jayesh"));
		list.add(new Student(102, "Kiran"));
		
		list.forEach(student -> System.out.println(student.toString()));
		
		System.out.println("--------------------------------");
		
		for(Student student: list)
		{
			System.out.println(student.toString());
		}

	}

}
