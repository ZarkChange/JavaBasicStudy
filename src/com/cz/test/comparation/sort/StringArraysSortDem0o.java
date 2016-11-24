package com.cz.test.comparation.sort;

import java.util.Arrays;
import java.util.Iterator;

public class StringArraysSortDem0o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits=new String[]{"Pineapple","Orange","Apple","Banana"};
		
		Arrays.sort(fruits);
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.println("fruits"+i+":"+fruits[i]);
		}
	}

}
