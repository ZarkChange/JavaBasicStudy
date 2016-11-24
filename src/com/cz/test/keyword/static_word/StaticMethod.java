package com.cz.test.keyword.static_word;

/**
 * static 修饰方法，可以直接  类名.方法名()调用该方法，不用new了
 *
 */

class Say{
	public static void say(){
		System.out.println("Hello world");
	}
}

public class StaticMethod {
	public static void mian(String [] args) {
		Say.say();
	}
}
