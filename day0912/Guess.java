package day0912;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0 ,b = 0;
		System.out.println("��������Ҫ���е���Ϸ��:");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Scanner p = new Scanner(System.in);
		for(int i = 0; i<t;i++ ){
			System.out.println("��ѡ����Ҫ������ʲô1.ʯͷ��2.������3.��");
			
			int per = p.nextInt();
			int pc = (int)(Math.random()*3)+1;
			if(per==1&&pc==2){
				System.out.println("��ҵ÷�");
				a += 1;
			}
			if(per==2&&pc==3){
				System.out.println("��ҵ÷�");
				a += 1;
			}
			if(per==3&&pc==1){
				System.out.println("��ҵ÷�");
				a += 1;
			}
			if(pc==1&&per==2){
				System.out.println("���Ե÷�");
				b += 1;
			}
			if(pc==2&&per==3){
				System.out.println("���Ե÷�");
				b += 1;
			}
			if(pc==3&&per==1){
				System.out.println("���Ե÷�");
				b += 1;
			}
			if(per==pc){
				System.out.println("ƽ�ֲ��÷�");
				}
		}
		System.out.println("�������յ÷���"+a+"�֣���");
		System.out.println("���Ե����յ÷���"+b+"�֣���");
		if (a > b){
			System.out.println("��ϲ���������ʤ��~~");
			
		}
		if(a < b){
			System.out.println("���ź�~������~~");
		}
		if(a == b){
			System.out.println("ƽ�֣�����");
		}
		sc.close();
		p.close();
	}

}
