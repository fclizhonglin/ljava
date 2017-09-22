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
	 * 创建电影票
	 */
	tt.cTickets();
	/*展示电影*/
	System.out.println("欢迎来到电影院");
	while(flag){
		
		Ticket t = new Ticket();
		tt.showfilm();
		tt.pickfilm(t);
		tt.showtime();
		tt.picktime(t);
		tt.pickseat(t);
		tt.Issuance(t);
		
		System.out.println("是否继续购票y/n");
		String d = sc.next();
		if(!d.equalsIgnoreCase("y")){
			flag = false;
			System.out.println("谢谢光临");
		}
	}
	tt.showyt();
	
	
	sc.close();
}
}
