package com.example.producerconsumer;

public class Consumer implements Runnable {
	ProductStack ps = new ProductStack();
	Consumer(ProductStack ps){
		this.ps = ps;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 20;i++){
			ps.pop();
		}
		try {
			Thread.sleep((int)Math.random()*500);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
