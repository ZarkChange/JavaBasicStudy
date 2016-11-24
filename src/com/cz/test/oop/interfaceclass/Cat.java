package com.cz.test.oop.interfaceclass;

public class Cat extends Animal implements Eat, Drink {

	private String name;
	
	
	/**
	 * @param name
	 */
	public Cat(String name) {
		super();
		this.name = name;
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println(name+" cat drink...");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name+" cat eat...");
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		System.out.println(name+" cat back...");
		
	}

	@Override
	public int getVelocity() {
		// TODO Auto-generated method stub
		return 100;
	}

}
