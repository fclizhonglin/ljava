package day0913;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"ʯͷ","����","��"};
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("����һ����ȭ��Ϸ����ѡ����Ҫ�����ǣ�\n 1.ʯͷ 2.���� 3.��");
		System.out.println("��������Ҫ��ľ���~");
		int t = sc.nextInt();
		int pers = 0;
		int pcs = 0;
		for(int i = 0;i<t;i++){
			System.out.println("���ȭ");
			int per = sc.nextInt();
			switch(per){
			case 1:System.out.println("�������"+arr[per-1]);
				   break;
			case 2:System.out.println("�������"+arr[per-1]);
			       break;
			case 3:System.out.println("�������"+arr[per-1]);
			       break;
			
			}
			int pc = (int)(Math.random()*3)+1;
			switch(pc){
			case 1:System.out.println("���Գ�����"+arr[pc-1]);
				   break;
			case 2:System.out.println("���Գ�����"+arr[pc-1]);
			       break;
			case 3:System.out.println("���Գ�����"+arr[pc-1]);
			       break;
			}
			if((per==1&&pc==2)||(per==2&&pc==3)||(per==3&&pc==1)){
				System.out.println("������ʤ����");
				pers++;
				if(pers>=(t/2+1)){
					i=t;
				}
			}else if(per==pc){
				System.out.println("ƽ�֣�");
				i--;
			}else{
				System.out.println("�����ˣ�");
				pcs++;
				if(pcs>=(t/2+1)){
					i=t;
				}
			}
		}
		System.out.println("=================");
		System.out.println("������յ÷��ǣ�"+pers);
		System.out.println("���Ե����յ÷��ǣ�"+pcs);
		if(pers>pcs){
			System.out.println("��ϲ����Ӯ�ˣ�");
		}else if(pcs>pers){
			System.out.println("���ź������ٽ�������");
		}else{
			System.out.println("ƽ�֣������¿�ʼ��Ϸ��");
		}
		sc.close();
	}
}
