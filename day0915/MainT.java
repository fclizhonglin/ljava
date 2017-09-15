package day0915;

import java.util.Scanner;

public class MainT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Juicer juicer = new Juicer();
//		String fruit = juicer.juicing("芒果");
//		System.out.println(fruit);
//		System.out.println(juicer.juicing("西瓜"));
		Scanner sc = new Scanner(System.in);
		System.out.println("======欢迎来到英雄联盟======");
		System.out.println("请选择您需要的角色：1.盖伦  2.寒冰  3.流浪");
		
		String name = null;
		boolean flag = true;
		while(flag){
			int i = sc.nextInt();
			switch(i){
			case 1: name = "盖伦";break;
			case 2: name = "寒冰"; break;
			case 3: name = "流浪"; break;
			default : System.out.println("您的选择有误，请重新选择...");
			}
			if(name != null){
				flag = false;
			}
		}
		
		
		System.out.println("欢迎你"+name+"你想喝什么果汁呢？");
		String fruit = sc.next();
		Juicer juicer = new Juicer();
		juicer.juicing(fruit);
		System.out.println("这是你的"+fruit+"汁！请拿好！"+"欢迎下次光临"+name);
		sc.close();
		
	}

}
