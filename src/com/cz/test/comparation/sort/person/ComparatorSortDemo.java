package com.cz.test.comparation.sort.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person(20, "Marry");
        Person person2 = new Person(21, "Tom");
        Person person3 = new Person(21, "Daniel");
        Person person4 = new Person(18, "Mischa");
        Person person5 = new Person(20, "Christian");
        
        Person[] arrays=new Person[]{person1,person2,person3,person4,person5};
        
        Arrays.sort(arrays,new PersonComparator());
        
        for(Person person:arrays){
        	System.out.println("Person:"+person.getAge()+"/"+person.getFullname());
        }
        
        
        System.out.println("---------------");
        
        
        List<Person> list=new ArrayList<Person>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        
        
        Collections.sort(list,new PersonComparator());
        
        for(Person person:list){
        	System.out.println("Person:"+person.getAge()+"/"+person.getFullname());
        }
        
	}

}
