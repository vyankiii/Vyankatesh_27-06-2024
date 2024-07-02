package com.javaSetCollections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Example4 {

	public static void main(String[] args) {

		Set<Integer> list = new TreeSet<Integer>();
		
		list.add(330);
		list.add(240);
		list.add(700);
		list.add(330);
		list.add(670);
		list.add(776);
		list.add(990);
		list.add(445);

		Iterator<Integer> listIterator = list.iterator();

		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
	}

}
