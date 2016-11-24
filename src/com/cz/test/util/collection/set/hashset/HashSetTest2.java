package com.cz.test.util.collection.set.hashset;

import java.util.HashSet;

//向HashSet中存入一个元素，HashSet会调用该对象的HashCode()方法获得该对象的HashCode值，然后根据HashCode值确定该对象在HashSet中的位置
//若两个对象通过equals()方法判断返回true，但是HashCode()方法返回值不相等，HashCode将会把它们存储在不同位置，依然可以添加成功
//HashSet判断两个对象是否相等的标准:equals()方法比较相等，并且HashCode()方法比较也相等

//类A的equals()方法总是返回true，但没有重写其hashCode（）方法	
class A{
	public boolean equals(Object o){
		return true;
	}
}

//类B的hashCode()方法总是返回1，但没有重写其equals（）方法	
class B{
	public int hashCode(){
		return 1;
	}
}

//类C的hashCode()方法总是返回2，且重写其equals（）方法	
class C{
	public int hashCode(){
		return 2;
	}
	
	public boolean equals(Object o){
		return true;
	}
}




public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet books=new HashSet();
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		
		System.out.println(books);
	}

}
