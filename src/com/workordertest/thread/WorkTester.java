package com.workordertest.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class WorkTester {

     public static void main(String[] args) {
    	 
    	 BlockingQueue<Order> orders = new ArrayBlockingQueue<Order>(5);

           Worker aWorker = new Worker(orders);
           WorkerConsumer workConsumer = new WorkerConsumer(orders);
     
           new Thread(aWorker).start();
           new Thread(workConsumer).start();
     }
	
}
