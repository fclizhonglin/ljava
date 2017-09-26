package com.dodi.cb;

import com.dodi.ab.Vehicle;

public class Train extends Vehicle {

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(String shape,String speed) {
		super(shape,speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moving() {
		System.out.println("I'm train Œ€~~~~~~");

	}

	@Override
	public void speedometer() {
		// TODO Auto-generated method stub
		System.out.println(" ±ÀŸ"+getSpeed());
	}

}
