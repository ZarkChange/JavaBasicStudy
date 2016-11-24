package com.cz.test.oop.extend;

import java.util.Random;

public class CastDemo {
	
	public static Animal getRandomAnimal(){
		int random=new Random().nextInt(2);
		
		Animal animal=null;
		if(random==0){
			animal=new Cat("tom", 5, 30);
		}else{
			animal=new Mouse("jerry",5);
		}
		return animal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=getRandomAnimal();
		
		if(animal instanceof Cat){
			Cat cat=(Cat) animal;
			
			System.out.println(cat.getName()+"-"+cat.getAge()+"-"+cat.getAnimalName());
		}else if(animal instanceof Mouse){
			Mouse mouse=(Mouse) animal;
			System.out.println(mouse.getName()+"-"+mouse.getWeight()+"-"+mouse.getAnimalName());
		}
	}


}
