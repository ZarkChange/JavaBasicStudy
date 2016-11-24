package com.cz.test.thread;
/**
 * 实现Runnable接口
 * @author admin
 *
 */
class NewThread implements Runnable{
	Thread t;
	NewThread() {
		t=new Thread(this,"Demo Thread");
		System.out.println("Child thread:"+t);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			for (int i = 5; i >0 ; i--) {
				System.out.println("Child Thread:"+i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Child thread interrupted");
		}
		System.out.println("Exiting child thread");
	}
	
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread();
		System.out.println("-----");
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main thread:"+i);
				Thread.sleep(100);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Main thread interrupted");
		}
		System.out.println("Exiting main thread");
		
	}

}
