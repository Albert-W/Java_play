package com.itranswarp.learnjava.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Store {

	private List<ProductObserver> observers = new CopyOnWriteArrayList<>();
	private Map<String, Product> products = new ConcurrentHashMap<>();

	public void addObserver(ProductObserver observer) {
		this.observers.add(observer);
	}

	public void removeObserver(ProductObserver observer) {
		this.observers.remove(observer);
	}

	public void addNewProduct(String name, double price) {
		Product p = new Product(name, price);
		products.put(p.getName(), p);
		observers.forEach(o -> {
			try {
				o.onPublished(p);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	public void setProductPrice(String name, double price) {
		Product p = products.get(name);
		p.setPrice(price);
		observers.forEach(o -> o.onPriceChanged(p));
	}
}
