package com.workordertest.thread;

import java.util.concurrent.BlockingQueue;

public class WorkerConsumer implements Runnable {

	private BlockingQueue<Order> orders;
	
	public WorkerConsumer(BlockingQueue<Order> orders) {
        this.orders = orders;
    }
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(20);
                orders.take().setStateField("FULFILLED");
                System.out.println("The Order" + i + "is processed, and the order state is FULFILLED");
            } catch (Exception e) {
                System.out.println("Exception:" + e);
            }
        }
		
	}
}
