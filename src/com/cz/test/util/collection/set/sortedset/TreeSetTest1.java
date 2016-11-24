package com.cz.test.util.collection.set.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet set=new TreeSet();
		set.add(2);
		set.add(12);
		set.add(4);
		set.add(-4);
		set.add(27);
		set.add(17);
		
		//第一个元素
		System.out.println(set.first());
		//最后一个元素
		System.out.println(set.last());
		//返回小于12的集合
		System.out.println(set.headSet(12));
		//返回大于6的集合
		System.out.println(set.tailSet(6));
		//返回大于-3小于5的子集
		System.out.println(set.subSet(-3, 5));

	}

}
