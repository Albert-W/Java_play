package com.itranswarp.learnjava.observer;

public interface ProductObserver {

	void onPublished(Product product) throws InterruptedException;

	void onPriceChanged(Product product);
}
