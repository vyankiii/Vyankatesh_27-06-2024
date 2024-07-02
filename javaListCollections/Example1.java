package com.javaListCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();// 10
		// ArrayList<Integer> list = new ArrayList<Integer>();//10

		list.add(330);
		list.add(240);
		list.add(700);
		list.add(670);

		ListIterator<Integer> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("---------------------------------");

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
