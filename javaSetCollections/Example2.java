package com.javaSetCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {

		Set<Integer> list = new LinkedHashSet<Integer>();

		list.add(330);
		list.add(240);
		list.add(700);
		list.add(330);
		list.add(670);
		list.add(null);
		list.add(990);
		list.add(null);

		Iterator<Integer> listIterator = list.iterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

	}

}
