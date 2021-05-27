package com.pc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;


public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(5);
		
		Thread producerThread = new Thread(new ProducerThread(blockingQueue));
		
		Thread consumerThread = new Thread(new ConsumerThread(blockingQueue));
		
		producerThread.start();
		consumerThread.start();
		
		producerThread.join();
		consumerThread.join();
		

	}

}
