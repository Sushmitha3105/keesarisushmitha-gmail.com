package com.chicky;// Java Program to demonstrate usage of BlockingQueue

import java.util.concurrent.*;
// EXAMPLE OF ARRAYBLOCKINGQUEUE

 class Bounded{
	public static void main(String[] args)
		throws InterruptedException
	{
		int capacity = 5;

		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(capacity);
		queue.put("A");
	//	queue.put("B");
		queue.add("C");
		queue.put(" D ");
		queue.put(" E ");
		queue.put("F ");

		//put and add for adding elements.
		// remove for removing elements



		System.out.println("queue contains " + queue);

		queue.remove();
		queue.remove();

		queue.put(" G ");
		queue.put(" H ");
		//queue.put(" I ");

		System.out.println("queue contains " + queue);
	}
}
