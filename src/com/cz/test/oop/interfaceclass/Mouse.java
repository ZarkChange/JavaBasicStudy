package com.cz.test.oop.interfaceclass;

public class Mouse extends Animal implements Eat, Drink {

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Mouse drink ...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mouse eat ...");
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		System.out.println("Mouse back ...");
	}

	@Override
	public int getVelocity() {
		// TODO Auto-generated method stub
		return 90;
	}

}
