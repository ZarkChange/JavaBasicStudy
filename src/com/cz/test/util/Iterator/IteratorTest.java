package com.cz.test.util.Iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new HashSet();
		c.add("苹果");
		c.add("橘子");
		c.add("菠萝");
		
		Iterator it=c.iterator();
		while (it.hasNext()) {
			String fruit = (String) it.next();
			System.out.println(fruit);
			
			if(fruit.equals("苹果")){
				it.remove();
			}
			fruit="测试字符";
		}
		System.out.println("\n");
		for(Object obj:c){
			String fruit=(String) obj;
			System.out.println(fruit);
		}
		System.out.println("\n");
		System.out.println(c);
		
	}

}
