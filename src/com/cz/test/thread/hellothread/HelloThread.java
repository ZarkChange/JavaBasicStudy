package com.cz.test.thread.hellothread;

public class HelloThread extends Thread{
	// Code of method run() will be executed when
    // thread call start()
   
	@Override
	public void run(){
		int idx=1;
		for (int i = 0; i < 9 ; i++) {
			System.out.println("  -- Hello Thread run:"+idx++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("  -==>Hello Thread stoped");
		
	}
}
