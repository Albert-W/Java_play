package com.itranswarp.learnjava.bridge;

public class TinyCar extends RefinedCar {

	public TinyCar(Engine engine) {
		super(engine);
	}

	@Override
	public String getBrand() {
		return "Tiny";
	}
}
