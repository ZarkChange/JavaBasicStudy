package com.cz.test.util.collection.set.enumSet;


public class Timetable {
	public static void getJob(WeekDay weekDay){
		if(weekDay==WeekDay.SATURDAY||weekDay==WeekDay.SUNDAY){
			System.out.println("DoNothing");
		}
		System.out.println("DoCoding");
	}
	
	public static void main(String[] args){
		Timetable.getJob(WeekDay.MONDAY);
	}
}
