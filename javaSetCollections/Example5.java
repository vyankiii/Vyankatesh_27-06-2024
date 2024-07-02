package com.javaSetCollections;

public class Example5 {

	enum week {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {

		System.out.println(week.MONDAY);

		System.out.println("-----------------------");

		for (week w : week.values()) {
			System.out.println(w);
		}

		System.out.println("-----------------------");

	}

}
