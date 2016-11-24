package com.cz.test.util.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c=new ArrayList();
		
		c.add("java讲义");
		c.add("疯狂android");
		c.add("高等数学");
		System.out.println("c集合是否包含java讲义?"+c.contains("java讲义"));
		System.out.println("c的集合元素："+c);
		
		Collection books=new HashSet();
		books.add("java讲义");
		books.add("高等数学");
		System.out.println("c集合是否完全包含books集合？"+c.containsAll(books));
		
		
		Iterator iterator=c.iterator();
		System.out.println("c集合中的元素：");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		c.removeAll(books);
		System.out.println("c集合中减去books集合："+c);
		
		
		
		
	}

}
