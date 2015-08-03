package com.example.producerconsumer;

public class Product {
	private int id;
	Product(int id){
		this.id = id;
	}
	public String getInfo(){
		return "Product:" + id;
	}
}
