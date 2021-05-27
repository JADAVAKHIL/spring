package com.pc;

import java.util.concurrent.BlockingQueue;


 class ProducerThread implements Runnable{
	 
  private BlockingQueue<Integer> blockingQueue;
	 
	 public ProducerThread(BlockingQueue<Integer> blockingQueue) {
		 this.blockingQueue = blockingQueue; 
	 }
	 @Override
	 public void run() {
		 try {
			int value = 0;
			 while(true) {
				  blockingQueue.put(value);
				 System.out.println("consumed "+ value);
				 value++;
				 
				 Thread.sleep(1500);
			 }
		 } catch(InterruptedException e) {
			 e.printStackTrace();
			 
		 }
	 }

}
