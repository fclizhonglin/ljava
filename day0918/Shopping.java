package day0918;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "admin";
		String password = "123456";
		Scanner sc = new Scanner(System.in);
		Usr[] usr = {new Usr(1,"����","��","��ɳ",50),new Usr(2,"��÷÷","Ů","����",100),new Usr(3,"���","����","����",200)};
		System.out.println("��ӭ�����û�������棬���¼~");
		System.out.print("�����볬���û�����");
		String name = sc.next();
		System.out.print("���������룺");
		String psw = sc.next();
		
		if(name.equals(username)&&psw.equals(password)){
			boolean flag = true;
			while(flag){
				System.out.println("����ɹ��������û����й��������");
				System.out.println("1.�û���Ϣ  2.�û�����");
				int i = sc.nextInt();
				switch(i){
				case 1:Usr.showuser(usr);break;
				case 2:System.out.println("��ѡ����Ҫ�������û�id��");
					   int id = sc.nextInt();
					   Usr.chooseUser(usr,id);
					   break;
			    default:flag = false;
			    		break;
				}
				
				
				
			}
			}else{
				System.out.println("�Բ���������������");
			}
			
		System.out.println("��������");
		sc.close();
		return;
		
		
	}

}
