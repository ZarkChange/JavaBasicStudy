package com.cz.test.thread.jointhread;

public class JoinTest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.out.println("\n==> Main thread starting..\n");
		
		Thread joinThreadA=new JoinThread("A", 2);
		
		Thread joinThreadB=new JoinThread("B", 3);
		
		
		//None join Thread
		Thread noJoinThreadC=new JoinThread("C", 5);
		
		joinThreadA.start();
		joinThreadB.start();
		noJoinThreadC.start();
		
		//using join()
		joinThreadA.join();
		joinThreadB.join();
		
		//The fllowing code will have wait util 2
		//JoinThread A,B completed
		System.out.println("Hello from main thread..");
		
		
		System.out.println("Thread A isLive?"+joinThreadA.isAlive());
		System.out.println("Thread B isLive?"+joinThreadB.isAlive());
		System.out.println("Thread C isLive?"+noJoinThreadC.isAlive());
		
		System.out.println("\n==> main thread end!\n");

	}

}
