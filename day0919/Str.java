package day0919;

public class Str {
public static void main(String[] args) {
	String str = new String("�ٱ������ؼĴʣ�������������֪���������ճ����ҹ������˽��ʱ������Ը���������ڵ�ԸΪ����֦���쳤�ؾ���ʱ�����˺������޾��ڡ�");
	String[] gg = str.split("��");
	for(String a:gg){
		System.out.println(a+"��");
	}
}


}
