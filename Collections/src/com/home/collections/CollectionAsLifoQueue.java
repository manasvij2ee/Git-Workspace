package com.home.collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;

public class CollectionAsLifoQueue {
	 
    public static void main(String args[]) {
            
          Deque<String> dq = new ArrayDeque<String>(5);
          dq.add("java");
          dq.add("c");
          dq.add("c++");
          dq.add("unix");
          dq.add("perl");   
          System.out.println(dq);
          Queue<String> q = Collections.asLifoQueue(dq);   
          System.out.println("Returned queue is: "+q);
       } 
}
