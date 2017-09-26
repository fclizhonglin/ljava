package com.dodi.cb;

import com.dodi.ab.Vehicle;

public class Plane extends Vehicle {

	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plane(String shape,String speed) {
		super(shape,speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moving() {
		System.out.println("I'm plane i fling");
		
	}

	@Override
	public void speedometer() {
		System.out.println("Ê±ËÙ"+getSpeed());
	}

}
