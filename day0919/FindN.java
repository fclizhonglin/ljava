package day0919;

import java.util.Scanner;

public class FindN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"李晓梅","王晓红","张小虎","马云"};
		System.out.println("请输入您要搜索的名字：");
		Scanner sc = new Scanner(System.in);
		String a =sc.next();
		for (String name:names){
			if((name.substring(1)).equals(a)){
				System.out.println("姓："+name.substring(0, 1));
				System.out.println("名："+a);
			}
		}
		sc.close();
	}

}
