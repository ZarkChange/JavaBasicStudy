package com.cz.test.oop.extend;

public class InheritMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat tom =new Cat("tom", 5, 20);
		
		System.out.println("name:"+tom.getName());
		System.out.println("animalName:"+tom.getAnimalName());
		
		System.out.println("-------------");
		
		System.out.println("Age:"+tom.getAge());
		System.out.println("Height:"+tom.getHeight());

	}

}
