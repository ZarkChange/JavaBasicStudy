package com.cz.test.util.collection.set.enumSet;


public class ValusesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeekDay[] allDays=WeekDay.values();
		
		for(WeekDay weekday:allDays){
			System.out.println("Day:"+weekday);
			
		}

	}

}
