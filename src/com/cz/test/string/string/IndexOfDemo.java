package com.cz.test.string.string;

public class IndexOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is text";
		
		int idx=str.indexOf('i');
		System.out.println("- indexof('i')="+idx);
		
		
		idx=str.indexOf('i', 2);
		System.out.println("- indexof('i')="+idx);
		
		
		idx=str.indexOf("te");
		System.out.println("- indexof('i')="+idx);
	}

}
