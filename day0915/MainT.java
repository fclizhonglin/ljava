package day0915;

import java.util.Scanner;

public class MainT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Juicer juicer = new Juicer();
//		String fruit = juicer.juicing("â��");
//		System.out.println(fruit);
//		System.out.println(juicer.juicing("����"));
		Scanner sc = new Scanner(System.in);
		System.out.println("======��ӭ����Ӣ������======");
		System.out.println("��ѡ������Ҫ�Ľ�ɫ��1.����  2.����  3.����");
		
		String name = null;
		boolean flag = true;
		while(flag){
			int i = sc.nextInt();
			switch(i){
			case 1: name = "����";break;
			case 2: name = "����"; break;
			case 3: name = "����"; break;
			default : System.out.println("����ѡ������������ѡ��...");
			}
			if(name != null){
				flag = false;
			}
		}
		
		
		System.out.println("��ӭ��"+name+"�����ʲô��֭�أ�");
		String fruit = sc.next();
		Juicer juicer = new Juicer();
		juicer.juicing(fruit);
		System.out.println("�������"+fruit+"֭�����úã�"+"��ӭ�´ι���"+name);
		sc.close();
		
	}

}
