package com.cz.test.thread.jointhread;

public class JoinThread extends Thread{
	private String threadName;
	private int count;
	/**
	 * @param threadName
	 * @param count
	 */
	public JoinThread(String threadName, int count) {
		super();
		this.threadName = threadName;
		this.count = count;
	}
	
	@Override
	public void run(){
		for (int i = 1; i < count+1; i++) {
			System.out.println("Hello from "+this.threadName+" "+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\n==>Thread "+threadName+" end\n");
	}

}
