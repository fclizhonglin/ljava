package com.dodi.cb;

import com.dodi.ab.Vehicle;

public class Car extends Vehicle {

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String shape, String speed) {
		super(shape, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moving() {
		System.out.println("I'm car driving");

	}

	@Override
	public void speedometer() {
		// TODO Auto-generated method stub
		System.out.println("Ê±ËÙ"+getSpeed());
	}

}
