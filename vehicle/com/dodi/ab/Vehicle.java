package com.dodi.ab;

public abstract class Vehicle {
private String shape;
private String speed;
public String getShape() {
	return shape;
}

public void setShape(String shape) {
	this.shape = shape;

}

public String getSpeed() {
	return speed;
}

public void setSpeed(String speed) {
	this.speed = speed;
}

public Vehicle() {
	super();
	
}
public Vehicle(String shape,String speed) {
	super();
	this.shape = shape;
	this.speed = speed;
}

public abstract void moving();
public abstract void speedometer();

}
