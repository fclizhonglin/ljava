package day0913;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的成绩");
		int per = sc.nextInt();
//		if (per >= 90){
//			System.out.println("你的成绩属于A类");
//			
//		}
//		if (per >= 75&&per <90){
//			System.out.println("你的成绩属于B类");
//		}
//		if (per >= 60&&per <75){
//			System.out.println("你的成绩属于C类");
//		}
//		if (per < 60){
//			System.out.println("你的成绩属于D类");
//		}
		/*该判断无精度 要求排列*/
		if (per >= 90){
			System.out.println("a");
		}else if(per >= 75){
			System.out.println("b");
		}else if(per >= 60){
			System.out.println("c");
		}else{
			System.out.println("d");
		}
		/*该判断依照条件精度从大到小排列*/
		sc.close();
	}

}
