package com.dodi.rt;

public abstract class Reptiles {
private int legs;
public Reptiles(){
	super();
	System.out.println("oo");
	
}
public Reptiles(int legs) {
	super();
	this.legs = legs;
	System.out.println("ooo");
}
public int getLegs() {
	return legs;
}
public void setLegs(int legs) {
	this.legs = legs;
}
public abstract void run();
public void drink(){
	System.out.println("hehehe");
}
}
