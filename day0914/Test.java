package day0914;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.eat();
		Juicer juicer = new Juicer();
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�ȵ�ʲô��֭�أ�");
		String fruit = sc.next();
		System.out.println("�����أ�");
		int count = sc.nextInt();
		juicer.juicng(fruit, count);
		sc.close();
		
	}

}
