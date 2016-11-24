package com.cz.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		String str=String.format("Current date/time : %tc", date);
		System.out.printf(str);
		
		
		SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd");
		String input =args.length==0?"1818-11-11":args[0];
		System.out.println(input+"Parses as");
		
		Date t;
		try {
			t=ft.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Unparseabke using"+ft);
		}
		
	}

}
