package com.cz.test.keyword.static_word;



/**
 * Static关键字介绍
 * @deprecated   Static表示"全局"或"静态"的意思用来修饰成员变量和成员方法，也可以形成静态代码块
 * 				 只要这个类被加载
 *
 */
class StaticClass{
	static int i;
	public StaticClass(){
		i=4;
	}
	
	public StaticClass(int j){
		i=j;
	}
}

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass s1=new StaticClass();
		StaticClass s2=new StaticClass(5);
		System.out.println(s1.i);
		System.out.println(s2.i);
		System.out.println(s1.i);
	}

}
