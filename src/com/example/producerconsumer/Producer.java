package com.example.producerconsumer;

public class Producer implements Runnable{
	ProductStack ps = new ProductStack();
	Producer(ProductStack ps) {
		this.ps = ps;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 20;i++){
			Product p = new Product(i);
			ps.push(p);
			try {
				Thread.sleep((int)Math.random()*500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
