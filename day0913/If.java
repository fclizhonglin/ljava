package day0913;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳɼ�");
		int per = sc.nextInt();
//		if (per >= 90){
//			System.out.println("��ĳɼ�����A��");
//			
//		}
//		if (per >= 75&&per <90){
//			System.out.println("��ĳɼ�����B��");
//		}
//		if (per >= 60&&per <75){
//			System.out.println("��ĳɼ�����C��");
//		}
//		if (per < 60){
//			System.out.println("��ĳɼ�����D��");
//		}
		/*���ж��޾��� Ҫ������*/
		if (per >= 90){
			System.out.println("a");
		}else if(per >= 75){
			System.out.println("b");
		}else if(per >= 60){
			System.out.println("c");
		}else{
			System.out.println("d");
		}
		/*���ж������������ȴӴ�С����*/
		sc.close();
	}

}
