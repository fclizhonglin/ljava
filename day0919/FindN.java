package day0919;

import java.util.Scanner;

public class FindN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"����÷","������","��С��","����"};
		System.out.println("��������Ҫ���������֣�");
		Scanner sc = new Scanner(System.in);
		String a =sc.next();
		for (String name:names){
			if((name.substring(1)).equals(a)){
				System.out.println("�գ�"+name.substring(0, 1));
				System.out.println("����"+a);
			}
		}
		sc.close();
	}

}
