package com.cz.test.oop.interfaceclass;

public class AnimalDemo {
	public static void main(String[] args){
		System.out.println("Drink "+Cat.SEVENUP);
		
		Eat eat1 = new Cat("Tom");
		
		Eat eat2 = new Mouse();
		
		eat1.eat();
		
		eat2.eat();
		
		boolean isCat=eat1 instanceof Cat;
		System.out.println("eat1 is cat?"+isCat);
		
		if(eat2 instanceof Mouse){
			Mouse mouse=(Mouse) eat2;
			mouse.drink();
		}
	}
}
