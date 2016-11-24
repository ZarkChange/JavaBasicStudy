package com.cz.test.util.collection.set.hashset;

import java.util.LinkedHashSet;
import java.util.Set;
//LinkedHashSet：HashSet的子类
//元素的顺序与添加的顺序一致

public class LinkedHashSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set=new LinkedHashSet();
		set.add("java");
		set.add("html");
		set.add("css");
		System.out.println(set);
		
		
		set.remove("java");
		set.add("java");
		System.out.println(set);

	}

}
