package com.dodi.bird;

import inte.FlyFunc;
import inte.SpFunc;

public abstract class Bird implements FlyFunc{
private String wings;
private String feather;
public Bird() {
	super();
	// TODO Auto-generated constructor stub
}
public Bird(String wings, String feather) {
	super();
	this.wings = wings;
	this.feather = feather;
}
public String getWings() {
	return wings;
}
public void setWings(String wings) {
	this.wings = wings;
}
public String getFeather() {
	return feather;
}
public void setFeather(String feather) {
	this.feather = feather;
}

}
