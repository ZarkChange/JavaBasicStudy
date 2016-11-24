package com.cz.test.thread.deamon;

public class DeamonThread extends Thread{

	@Override
	public void run(){
		int count=0;
		while(true){
			System.out.println("+ Hello from deamon thread"+count++);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
