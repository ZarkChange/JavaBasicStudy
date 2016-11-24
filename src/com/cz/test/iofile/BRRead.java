package com.cz.test.iofile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

	/**
	 * 从控制台读取字符
	 * int read( ) throws IOException
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter characters,'q' to quit");
		
		do{
			c=(char)br.read();
			System.out.println(c);
		}while(c!='q');

	}

}
