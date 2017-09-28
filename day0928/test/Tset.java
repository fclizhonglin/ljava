package com.dodi.test;

import com.dodi.card.Abc;
import com.dodi.ex.Exp;

public class Tset {
public static void main(String[] args) {
	Abc abc = new Abc("li",3000,"11");
	try {
		abc.login();
	} catch (Exp e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	abc.chose();
}
}
