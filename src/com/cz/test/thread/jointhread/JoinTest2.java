package com.cz.test.thread.jointhread;

public class JoinTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("\n==> Main thread starting..\n ");
		
		Thread joinThreadA =new JoinThread("A", 5);
		
		joinThreadA.start();
		
		//main thread must wait to 5s
		//and then continue runninig.(not necessarily joinThreadA finish)
		joinThreadA.join(5000);
		
		System.out.println("Main thread after 5s");
		System.out.println("Hello from main thread... ");
		
		System.out.println("Thread A isLive?" + joinThreadA.isAlive());
		
		System.out.println("\n==>Main Thread end!\n");

	}

}
