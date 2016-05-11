package com.workordertest.thread;

import java.util.concurrent.BlockingQueue;

public class Worker implements Runnable {
	
private BlockingQueue<Order> orders;
    
    public Worker(BlockingQueue<Order> orders) {
        this.orders = orders;
    }

	@Override
	public void run() {
	
		 for (int i = 1; i <= 10; i++) {
	            Order order = new Order("NEW",i);
	            try {
	            	Thread.sleep(10);
	                orders.put(order);
	                System.out.println("Order: Message - " + order.getStateField() + order.getOrderId() + " produced.");
	            } catch (Exception e) {
	                System.out.println("Exception:" + e);
	            }
	        }
		
	}

}



