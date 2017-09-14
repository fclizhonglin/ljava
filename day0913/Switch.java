package day0913;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"石头","剪刀","布"};
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("这是一个猜拳游戏，请选择您要出的是：\n 1.石头 2.剪刀 3.布");
		System.out.println("请输入你要玩的局数~");
		int t = sc.nextInt();
		int pers = 0;
		int pcs = 0;
		for(int i = 0;i<t;i++){
			System.out.println("请出拳");
			int per = sc.nextInt();
			switch(per){
			case 1:System.out.println("你出的是"+arr[per-1]);
				   break;
			case 2:System.out.println("你出的是"+arr[per-1]);
			       break;
			case 3:System.out.println("你出的是"+arr[per-1]);
			       break;
			
			}
			int pc = (int)(Math.random()*3)+1;
			switch(pc){
			case 1:System.out.println("电脑出的是"+arr[pc-1]);
				   break;
			case 2:System.out.println("电脑出的是"+arr[pc-1]);
			       break;
			case 3:System.out.println("电脑出的是"+arr[pc-1]);
			       break;
			}
			if((per==1&&pc==2)||(per==2&&pc==3)||(per==3&&pc==1)){
				System.out.println("你获得了胜利！");
				pers++;
				if(pers>=(t/2+1)){
					i=t;
				}
			}else if(per==pc){
				System.out.println("平局！");
				i--;
			}else{
				System.out.println("你输了！");
				pcs++;
				if(pcs>=(t/2+1)){
					i=t;
				}
			}
		}
		System.out.println("=================");
		System.out.println("你的最终得分是："+pers);
		System.out.println("电脑的最终得分是："+pcs);
		if(pers>pcs){
			System.out.println("恭喜，你赢了！");
		}else if(pcs>pers){
			System.out.println("很遗憾，请再接再厉！");
		}else{
			System.out.println("平局，请重新开始游戏！");
		}
		sc.close();
	}
}
