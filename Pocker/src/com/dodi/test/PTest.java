package com.dodi.test;

import java.util.Scanner;

import com.dodi.paction.*;

public class PTest {
public static void main(String[] args) {
	Paction pa = new Paction();
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	
	System.err.println("===�����׼����϶ĳ���������===");
	do{
		pa.shuffle();
		pa.deal();
		pa.show();
		while(pa.judge()){
			pa.addp();
			pa.show();
		}
		while(pa.judgepc()){
			pa.addc();
			pa.show();
		}
		pa.balance();
		System.out.println("�Ƿ�����һ�֣�y/n");
		String str=sc.next();
		if(str.equalsIgnoreCase("y")){
			flag=true;
		}else{
			flag=false;
		}
	}while(flag);
	System.out.println("������Ŷ~");
	
	System.out.println("������Ŷ~");
	sc.close();
	
}
}
