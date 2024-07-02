package com.javaSetCollections;

import java.util.EnumSet;
import java.util.Set;

public class Example6 {
	
	enum week
	{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public static void main(String[] args) {
	
		//EnumSet object.
		Set<week> enumSet = EnumSet.allOf(week.class);
		
		System.out.println(enumSet);
		
	}

}
