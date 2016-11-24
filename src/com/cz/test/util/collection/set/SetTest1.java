package com.cz.test.util.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set books=new HashSet();
		//添加一个字符串对象
		books.add(new String("java"));
		//再次添加一个字符串对象
		//因为两个字符串对象通过equals方法比较是否相等，所以添加失败，返回false
		boolean result=books.add(new String("java"));
		//从下面输出结果看到集合只有一个元素
		System.out.println(result+"-->"+books);
		
	}

}
