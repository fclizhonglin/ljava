package day0912;

public class gravity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 100;
		double l = 0;
		for (int i = 0; i <10;i++){
			l += a;
			a = a/2;
			l += a;
			if (i == 9){
				l -= a;
			}
			
		}
		System.out.println("��ʮ������"+a+"��");
		System.out.println("�ܹ�����"+l+"��");
	}

}
