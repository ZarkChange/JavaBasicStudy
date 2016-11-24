package com.cz.test.thread.deamon;

public class DeamonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==>Main Thread running..\n");
		
		//create thread
		Thread deamonThread=new DeamonThread();
		
		//set deamon true
		deamonThread.setDaemon(true);
		deamonThread.start();
		
		
		//create other thread
		
		new NoneDeamonThread().start();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//main thread ending
		System.out.println("\n==>Main Thread ending\n");
		
		
	}

}
