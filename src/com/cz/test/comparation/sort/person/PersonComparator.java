package com.cz.test.comparation.sort.person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		
		if(o1==null && o2==null){
			return 0;
		}
		
		if(o1 == null){
			return -1;
		}
		if(o2 == null){
			return 1;
		}
		
		int value=o1.getAge()-o2.getAge();
		if(value!=0){
			return value;
		}
		
		value=o1.getFullname().compareTo(o2.getFullname());
		
		return value;
	}

}
