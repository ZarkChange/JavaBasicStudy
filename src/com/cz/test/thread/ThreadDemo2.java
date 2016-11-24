package com.cz.test.thread;
/**
 * 继承Thread类
 * @author admin
 *
 */

//通过继承thread类创建线程
class NewThread2 extends Thread{
	NewThread2(){
		super("Demo Thread");
		System.out.println("Child thread:"+this);
		start();//开始线程
	}
	
	//第二个线程入口
	public void run(){
		
		try {
			for (int i = 5; i >0; i--) {
				
				if(i==3){
					Thread.interrupted();
				}else{
					System.out.println("Child thread :"+i);
					Thread.sleep(50);
				}

			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("child interrupted");
		}
		System.out.println("Exiting child thread ");
	}
}



public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个线程
		new NewThread2();
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("main thread:"+i);
				Thread.sleep(100);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("main thread interrupted");
		}
		System.out.println("Main thread exiting");
	}

}
