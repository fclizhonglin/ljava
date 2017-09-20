package com.dodi.pocker;

public class Pocker {
public String color;
public int point;
public Pocker() {
	super();
	// TODO Auto-generated constructor stub
}
public Pocker(String color, int point) {
	super();
	this.color = color;
	this.point = point;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPoint() {
	return point;
}
public void setPoint(int point) {
	this.point = point;
}
@Override
public String toString() {
	String str = "";
	switch(point){
	case 1 :  str = "A";
			  break;
	case 11 :  str = "J";
			  break;
	case 12 :  str = "Q";
			  break;
	case 13 :  str = "K";
			  break;	
	default : str = ""+point;
			  break;
	
	}
	return color+" "+str;
}


}
