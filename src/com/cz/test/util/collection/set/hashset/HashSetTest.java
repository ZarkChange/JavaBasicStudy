package com.cz.test.util.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set=new HashSet<String>();
		
		String a=new String("hello world");
		String b=new String("hello world");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		set.add(a);
		set.add(b);
		set.add("one");
		set.add("two");
		set.add("one");
		set.add("three");
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println(set.size());
		

	}

}
