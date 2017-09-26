package com.dodi.cb;

import com.dodi.ab.Vehicle;

public class Ship extends Vehicle {

	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ship(String shape, String speed) {
		super(shape, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moving() {
		// TODO Auto-generated method stub
		System.out.println("I'm ship swing");
	}

	@Override
	public void speedometer() {
		// TODO Auto-generated method stub
		System.out.println("Ê±ËÙ"+getSpeed());
	}

}
