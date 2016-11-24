package com.cz.test.iofile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {

	/**
	 * 从控制台读取字符串
	 * String readLine( ) throws IOException
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter lines of text");
		System.out.println("Enter 'end' to quit");
		
		do{
			str=br.readLine();
			System.out.println(str);
		}while(!str.equals("end"));

	}

}
