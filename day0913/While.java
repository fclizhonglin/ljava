package day0913;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(true){
//			System.out.println("��������������");
//		}
		for(int i = 0; i<10; i++){
			if(i%2==0){
				continue;/*�����˴�ѭ������ִ��*/
//				break;/*����ѭ��*/
//				return;/*�����������*/
			}
			System.out.println("���ǵ�"+i+"��ѭ��");
		}
		System.out.println("����");
	}

}
