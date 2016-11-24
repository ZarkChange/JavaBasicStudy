package com.cz.test.oop.extend;

public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal tom=new Cat("Tom", 5, 50);
		
		System.out.println("name:"+tom.getName());
		System.out.println("AnimalName:"+tom.getAnimalName());
		
		
		boolean isMouse=tom instanceof Mouse;
		System.out.println("Tom is mouse?"+isMouse);
		
		
		boolean isAnimal=tom instanceof Animal;
		System.out.println("Tom is animla?"+isAnimal);
	}

}
