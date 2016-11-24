package com.cz.test.keyword.static_word;

class Base{
	//静态代码块
	static{
		System.out.println("base static");
	}
	
	//构造方法
	public Base(){
		System.out.println("base constractor");
	}
}


public class StaticTest2 extends Base{
	
	//静态代码块
	static{
		System.out.println("test static");
	}
	
	//构造方法
	public StaticTest2(){
		System.out.println("test constractor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new StaticTest2();
	}

}
