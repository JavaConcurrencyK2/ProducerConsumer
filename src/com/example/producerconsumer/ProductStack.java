package com.example.producerconsumer;

public class ProductStack {
	Product[] product = new Product[5];
	int index = 0;
	public synchronized void push(Product p){
		try {
			while(index == product.length){
				System.out.println("生产满了");
				this.wait();
			}
			this.notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		product[index] = p;
		index++;
		System.out.println("生产了:"+p.getInfo()+";共"+index+"个产品");
	}
	public synchronized Product pop(){
		try{
			while(index == 0){
				System.out.println("消费完了");
				this.wait();
			}
			this.notify();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		index--;
		System.out.println("消费了："+product[index].getInfo()+"；共剩余"+index+"产品");
		return product[index];
	}
}
