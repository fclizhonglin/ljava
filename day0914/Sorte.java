package day0914;

import java.util.Scanner;

public class Sorte {
	public static void main(String[] args){
		System.out.println("请随意输入三个字符");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		if(a<b){
			int temp = a;
			a = b;
			b = temp;
				
		}
		if(a<c){
			int temp = a;
			a = c;
			c = temp;
		}
		if(b<c){
			int temp = b;
			b = c;
			c = temp;
		}
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
//		int max = 0;
//		int mid = 0;
//		int min = 0;
		
//		max = a;
//		if(max < b){
//			max = b;
//		}
//		if(max < c){
//			max = c;
//		}
//		min = a;
//		
//		if(min > b){
//			min = b;
//		}
//		if(min > c){
//			min = c;
//		}
//		mid = a;
//		if(mid==max||mid==min){
//			mid=b;
//		}
//		if(mid==max||mid==min){
//			mid=c;
//		}
//		
//		System.out.println(max);
//		System.out.println(mid);
//		System.out.println(min);
		sc.close();
	}
}
