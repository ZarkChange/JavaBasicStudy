package com.cz.test.thread.runnable;

public class Runnable1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int idx = 1;
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello from RunnableDemo"+idx++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
