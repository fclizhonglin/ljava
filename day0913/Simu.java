package day0913;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class Simu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*����Ϊһ���ṹ���ļ����ã�����һ���µ���С����*/
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<3;i++){
			System.out.println("����������û�����");
			String usr = sc.next();
			System.out.println("�������������");
			String pwd = sc.next();
			if(usr.equals("admin")){
				if(pwd.equals("123")){
					System.out.println("����ɹ���");
					i=3;
				}else{
					System.out.println("����������벻��ȷ��");
					if(i<2){
						System.out.println("�㻹��"+(2-i)+"�λ���");
					}else{
						System.out.println("����ʧ��");
					}
				}
			}else{
				System.out.println("����û���������~");
				if(i<2){
					System.out.println("�㻹��"+(2-i)+"�λ���");
				}else{
					System.out.println("����ʧ��");
				}
			}
		}
		sc.close();
		
		
		/*�����������*/
//		for(int i = 0; i<3; i++){
//			System.out.println("�������� ���˻���");
//			Scanner zh = new Scanner(System.in);
//			String yh = zh.next();
//			System.out.println("������������룺");
//			Scanner mm = new Scanner(System.in);
//			String pw = mm.next();
//			if(yh.equals("admin")&&pw.equals("123456")){
//				System.out.println("��ϲ��¼�ɹ�����");
//				break;
//			}else{ 
//				if(i<2){
//					System.out.println("������~");
//				}else{
//					System.out.println("����ʧ��");
//				}
//				
//			}
//			
//		}
		
	}

}
