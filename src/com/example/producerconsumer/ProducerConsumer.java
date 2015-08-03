package com.example.producerconsumer;

public class ProducerConsumer {
	public static void main(String[] args) {
		ProductStack ps = new ProductStack();
		Producer p = new Producer(ps);
		Consumer c = new Consumer(ps);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
