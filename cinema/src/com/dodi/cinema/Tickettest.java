package com.dodi.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tickettest {
	public static List<Ticket> tickets = new ArrayList<Ticket>();
	public static List<Ticket> stli = new ArrayList<Ticket>();
	public String[] times = {"13:00-14:30","14:50-16:20","16:40-18:20"};
	public String[] movies = {"�ؿ̶���","����һ��","������X������"};
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
	System.out.println("Ŀǰ������ӳ��ӰƬ�У�");
	for (int i = 0;i <3;i++){
		System.out.print((i+1)+"."+" "+movies[i]+"\t");
	}
	System.out.println();
	System.out.println("�밴��ѡ����Ҫ�ۿ���ӰƬ��");
}
public void showtime(){
	System.out.println("��Ƭ�Ĺ�Ӱʱ�����£�");
	for (int i = 0;i <3;i++){
		System.out.print((i+1)+"."+" "+times[i]+"\t");
	}
	System.out.println();
	System.out.println("�������Ҫѡ�����ʱ��Ρ�");
}
public void pickfilm(Ticket t){
	int i = sc.nextInt();
	if(i<3&&i>=0){
		String film = movies[i-1];
		System.out.println("��ѡ��ĵ�Ӱ��"+film);
		t.setName(film);
	}else{
		System.out.println("���ѡ������������ѡ��");
		pickfilm(t);
	}
	
	
}
public void picktime(Ticket t){
	int i =sc.nextInt();
	if(i<3&&i>=0){
		String time = times[i-1];
		System.out.println("��ѡ���ʱ�����"+time+"\t");
		t.setTime(time);
	}else{
		System.out.println("���ѡ������������ѡ��");
		picktime(t);
	}
	
	
}
public void pickseat(Ticket t){
	System.out.println("��ѡ����Ҫ������λ��");
	System.out.println("=====================��ӫĻ======================");
	for(int i = 1;i<6;i++){
		for(int j =1;j<11;j++){
			System.out.print(i+"-"+j+"\t");
		}
		System.out.println();
	}
	System.out.println("�������ź�");
	int row = sc.nextInt();
	if(row>5){
		System.out.println("�Բ���������ѡ��");
		pickseat(t);
	}
	System.out.println("����������");
	int col = sc.nextInt();
	if(row>10){
		System.out.println("�Բ���������ѡ��");
		pickseat(t);
	}
	int i = (row-1)*10 + col;
	String seat =""+row+"-"+""+col;
	System.out.println("��ѡ�����λ��"+seat);
	t.setSeat(i);
}

public void Issuance(Ticket t){
	if(stli.contains(t)){
		System.out.println("�Բ�����ѡ���Ʊ���۳�");		
	}else{
		System.out.println("����Ϊ����Ʊ~");
		System.out.println("��ѡ��ĵ�Ӱ"+t+" �ѳ�Ʊ");
		stli.add(t);
	}
	
}
public void showyt(){
	System.out.println("���ѹ��õ�Ʊ�����£�");
	for (int i =0;i<stli.size();i++){
		System.out.println(stli.get(i));
	}
}

}
