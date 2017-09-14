package day0914;

import java.util.Scanner;

public class Starts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<7;i++){
//			if(i==0||i==6){
//				for(int j=0;j<3;j++){
//					System.out.print(" ");
//				}
//				for(int z=0;z<1;z++){
//					System.out.print("*");
//				}
//			}
//			if(i==1||i==5){
//				for(int j=0;j<2;j++){
//					System.out.print(" ");
//				}
//				for(int z=0;z<3;z++){
//					System.out.print("*");
//				}
//			}
//			if(i==2||i==4){
//				for(int j=0;j<1;j++){
//					System.out.print(" ");
//				}
//				for(int z=0;z<5;z++){
//					System.out.print("*");
//				}
//			}
//			if(i==3){
//				for(int j=0;j<0;j++){
//					System.out.print(" ");
//				}
//				for(int z=0;z<7;z++){
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}
		System.out.println("请输入你要输出的最多星数在的行数");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;/*i为行数,j列数*/
		i = n*2 -1 ;
		for(int x= 0;x<n;x++){
			for (int z = 0;z<n-x-1;z++){
				System.out.print(" ");
			}
			for (int y=0;y<x*2+1;y++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int x=n;x<i;x++){
			for(int z = 0;z<x-(n-1);z++){
				System.out.print(" ");
			}
			for (int y=0;y<(2*n-x)*2-3;y++){
				System.out.print("*");
			}
			System.out.println("");

		}

		
		
		
		
		sc.close();
	}

}
