package day0912;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0 ,b = 0;
		System.out.println("请输入你要进行的游戏数:");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Scanner p = new Scanner(System.in);
		for(int i = 0; i<t;i++ ){
			System.out.println("请选择你要出的是什么1.石头、2.剪刀、3.布");
			
			int per = p.nextInt();
			int pc = (int)(Math.random()*3)+1;
			if(per==1&&pc==2){
				System.out.println("玩家得分");
				a += 1;
			}
			if(per==2&&pc==3){
				System.out.println("玩家得分");
				a += 1;
			}
			if(per==3&&pc==1){
				System.out.println("玩家得分");
				a += 1;
			}
			if(pc==1&&per==2){
				System.out.println("电脑得分");
				b += 1;
			}
			if(pc==2&&per==3){
				System.out.println("电脑得分");
				b += 1;
			}
			if(pc==3&&per==1){
				System.out.println("电脑得分");
				b += 1;
			}
			if(per==pc){
				System.out.println("平局不得分");
				}
		}
		System.out.println("您的最终得分是"+a+"分！！");
		System.out.println("电脑的最终得分是"+b+"分！！");
		if (a > b){
			System.out.println("恭喜！您获得了胜利~~");
			
		}
		if(a < b){
			System.out.println("很遗憾~您输了~~");
		}
		if(a == b){
			System.out.println("平局！！！");
		}
		sc.close();
		p.close();
	}

}
