package com.dodi.card;

import com.dodi.ex.Exp;

public abstract class Card{
private String name;
private int Account;
private String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccount() {
	return Account;
}
public void setAccount(int account) {
	Account = account;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Card() {
	super();
	// TODO Auto-generated constructor stub
}
public Card(String name, int account, String password) {
	super();
	this.name = name;
	Account = account;
	this.password = password;
}
public abstract void save(int i )throws Exp;
public abstract void take(int i )throws Exp;
public abstract void login()throws Exp;

}
