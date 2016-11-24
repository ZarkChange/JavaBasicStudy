package com.cz.test.thread.hellothread;

public class HelloMain {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		int idx = 1;
		
		for (int i = 0; i < 2 ; i++) {
			System.out.println("Hello Main run:"+idx++);
			Thread.sleep(3000);
		}
		
		HelloThread helloThread=new HelloThread();
		helloThread.start();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello Main run:"+idx++);
			Thread.sleep(3001);
		}
		
		System.out.println("==>main thread stop");
	   
	}

}
