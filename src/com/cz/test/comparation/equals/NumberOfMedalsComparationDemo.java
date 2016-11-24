package com.cz.test.comparation.equals;

public class NumberOfMedalsComparationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfMedals american = new NumberOfMedals(40, 20, 30);
		NumberOfMedals korea = new NumberOfMedals(10, 10, 15);
		NumberOfMedals china = new NumberOfMedals(40, 20, 30);
		
		System.out.println("Medals of American equals china?"+american.equals(china));
		
		System.out.println("Medals of American equals korea?"+american.equals(korea));;
		
	}

}
