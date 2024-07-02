package com.javaListCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example2 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();// 10

		list.add(new Student(101, "Ajay"));
		list.add(new Student(104, "Jayesh"));
		list.add(new Student(102, "Kiran"));

		ListIterator<Student> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("---------------------------------");

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
