package com.dodi.test;

import java.util.Scanner;

import com.dodi.cinema.Ticket;
import com.dodi.cinema.Tickettest;

public class Test {
public static void main(String[] args) {
	Tickettest tt = new Tickettest();
	
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	/**
	 * ������ӰƱ
	 */
	tt.cTickets();
	/*չʾ��Ӱ*/
	System.out.println("��ӭ������ӰԺ");
	while(flag){
		
		Ticket t = new Ticket();
		tt.showfilm();
		tt.pickfilm(t);
		tt.showtime();
		tt.picktime(t);
		tt.pickseat(t);
		tt.Issuance(t);
		
		System.out.println("�Ƿ������Ʊy/n");
		String d = sc.next();
		if(!d.equalsIgnoreCase("y")){
			flag = false;
			System.out.println("лл����");
		}
	}
	tt.showyt();
	
	
	sc.close();
}
}
