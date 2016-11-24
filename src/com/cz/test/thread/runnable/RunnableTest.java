package com.cz.test.thread.runnable;

public class RunnableTest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.out.println("main thread running..");
		
		Thread thread =new Thread(new Runnable1());
		
		thread.start();
		
		Thread.sleep(5000);
		
		System.out.println("main thread stopped");
	}

}
