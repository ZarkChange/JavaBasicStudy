package com.cz.test.util.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	/**
	 * QueueDemo
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new一个Queue类型的对象，实现类为LinkedList（LinkedList实现了Queue接口和List接口）
		Queue<String> names=new LinkedList<String>();
		
		// offer(E): Insert element to queue.
        // With LinkedList, element will inserted at the end of queue.
        // Return true if success.
        // Return false if queue full.
		names.offer("A");
		names.offer("B");
		names.offer("C");
		
		// add(E): Insert element to queue
        // With LinkedList, element will inserted at the end of queue.
        // Return true if success.
        // Throw exception if queue full.
		names.add("D");
		names.add("E");
		
		while(true){
			// Retrieves and removes the head of this queue, 
            // or returns null if this queue is empty.
			String name=names.poll();
			if(name==null){
				break;
			}
			System.out.println("names="+name);
		}
		
		
	}

}
