package com.dodi.pet;

public class Dog {
private String name;
public Dog(){
	super();
}
public Dog(String name){
	super();
	this.name = name;
}
public void setName(String name){
	this.name = name;
}
public String getName() {
	return name;
}

public void shut(){
	System.out.println("wawaw");
}

}
