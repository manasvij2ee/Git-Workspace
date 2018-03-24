package com.home;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		pQueue.add("Apple");
		pQueue.add("Nokia");
		pQueue.add("Samsung");
		pQueue.add("Apple");
		/*
		 * System.out.println(pQueue.poll()); System.out.println(pQueue);
		 */

		System.out.println(pQueue.peek());
		System.out.println(pQueue);

	}

}
