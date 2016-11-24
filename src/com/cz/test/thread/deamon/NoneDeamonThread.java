package com.cz.test.thread.deamon;

public class NoneDeamonThread  extends Thread{
	
	@Override
	public void run(){
		int i = 0 ;
		while(i<10){
			System.out.println(" - Hello from None Deamon Thred "+i++);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("\n==>None Deamon Thred ending\n");
	}

}
