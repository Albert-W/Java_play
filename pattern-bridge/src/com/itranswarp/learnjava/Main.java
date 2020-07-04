package com.itranswarp.learnjava;

import com.itranswarp.learnjava.bridge.BossCar;
import com.itranswarp.learnjava.bridge.ElectricEngine;
import com.itranswarp.learnjava.bridge.HybridEngine;
import com.itranswarp.learnjava.bridge.RefinedCar;
import com.itranswarp.learnjava.bridge.TinyCar;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		RefinedCar car1 = new BossCar(new HybridEngine());
		car1.drive();
		RefinedCar car2 = new TinyCar(new ElectricEngine());
		car2.drive();
	}
}
