package com.cz.test.util.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	/**
	 * PriorityQueue优先队列
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// With PriorityQueue queue, the elements will be arranged on the natural order
		Queue<String> names=new PriorityQueue<String>();
		
		
		// offer(E): Insert element to queue
        // Return true if success
        // Return false if queue is full.
		names.offer("c");
		names.offer("a");
		names.offer("d");
		
		
		// add(E): Insert element to queue.
        // Return true if success
        // Throw exceptiono if queue is full.
		names.add("g");
		names.add("b");
		
		
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
