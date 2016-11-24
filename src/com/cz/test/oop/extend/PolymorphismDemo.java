package com.cz.test.oop.extend;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1=new Cat("Tom", 5, 30);
		Cat cat2=new AsianCat("AsianTom", 3, 20);
		
		System.out.println("Animal Name of cat1: " + cat1.getAnimalName());
		
		System.out.println("Animal Name of cat2: " + cat2.getAnimalName());
	}

}
