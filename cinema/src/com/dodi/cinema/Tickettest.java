package com.dodi.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tickettest {
	public static List<Ticket> tickets = new ArrayList<Ticket>();
	public static List<Ticket> stli = new ArrayList<Ticket>();
	public String[] times = {"13:00-14:30","14:50-16:20","16:40-18:20"};
	public String[] movies = {"敦刻尔克","天生一对","嫌疑人X的献身"};
	static{
		stli.clear();
	}
	Scanner sc = new Scanner(System.in);

public void cTickets(){
	
	
	for(int j = 0;j<3;j++){
		for(int i = 0; i<3;i++){
			for(int k = 0;k<50;k++){
				Ticket ticket = new Ticket(movies[j],times[i],k);
				tickets.add(ticket);
			}
		}
	}
}
public void showfilm(){
	System.out.println("目前正在上映的影片有：");
	for (int i = 0;i <3;i++){
		System.out.print((i+1)+"."+" "+movies[i]+"\t");
	}
	System.out.println();
	System.out.println("请按号选择您要观看的影片。");
}
public void showtime(){
	System.out.println("本片的观影时段如下：");
	for (int i = 0;i <3;i++){
		System.out.print((i+1)+"."+" "+times[i]+"\t");
	}
	System.out.println();
	System.out.println("请根据需要选择合适时间段。");
}
public void pickfilm(Ticket t){
	int i = sc.nextInt();
	if(i<3&&i>=0){
		String film = movies[i-1];
		System.out.println("你选择的电影是"+film);
		t.setName(film);
	}else{
		System.out.println("你的选择有误，请重新选择");
		pickfilm(t);
	}
	
	
}
public void picktime(Ticket t){
	int i =sc.nextInt();
	if(i<3&&i>=0){
		String time = times[i-1];
		System.out.println("你选择的时间点是"+time+"\t");
		t.setTime(time);
	}else{
		System.out.println("你的选择有误，请重新选择");
		picktime(t);
	}
	
	
}
public void pickseat(Ticket t){
	System.out.println("请选择您要就坐的位置");
	System.out.println("=====================大荧幕======================");
	for(int i = 1;i<6;i++){
		for(int j =1;j<11;j++){
			System.out.print(i+"-"+j+"\t");
		}
		System.out.println();
	}
	System.out.println("请输入排号");
	int row = sc.nextInt();
	if(row>5){
		System.out.println("对不起请重新选择");
		pickseat(t);
	}
	System.out.println("请输入座次");
	int col = sc.nextInt();
	if(row>10){
		System.out.println("对不起请重新选择");
		pickseat(t);
	}
	int i = (row-1)*10 + col;
	String seat =""+row+"-"+""+col;
	System.out.println("您选择的座位是"+seat);
	t.setSeat(i);
}

public void Issuance(Ticket t){
	if(stli.contains(t)){
		System.out.println("对不起你选择的票已售出");		
	}else{
		System.out.println("正在为您出票~");
		System.out.println("您选择的电影"+t+" 已出票");
		stli.add(t);
	}
	
}
public void showyt(){
	System.out.println("您已购得的票根如下：");
	for (int i =0;i<stli.size();i++){
		System.out.println(stli.get(i));
	}
}

}
