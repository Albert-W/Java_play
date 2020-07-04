package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		Earth earth = Earth.getInstance();
		Earth earth2 = Earth.getInstance();
		earth2.setName("wukong");
		System.out.println(earth.getName());
		System.out.println(earth == earth2);

		World world = World.INSTANCE;
		System.out.println(world.getName());
	}
}
