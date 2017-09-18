package day0918;

import java.util.Scanner;

public class Usr {

private int id;
private String userName;
private String sex;
private String add;
private int point;
public Usr() {
	super();
	// TODO Auto-generated constructor stub
}
public Usr(int id,String userName, String sex, String add, int point) {
	super();
	this.id = id;
	this.userName = userName;
	this.sex = sex;
	this.add = add;
	this.point = point;
}
public int getid(){
	return id;
}
public void setid(int id){
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public int getPoint() {
	return point;
}
public void setPoint(int point) {
	this.point = point;
}

public static void showuser(Usr[] usr){
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	while(flag){
		System.out.println("��ѡ����Ҫ���еĲ�����1.��ӡ�����û�����  2.��ӡ�����û��Ա�  3.��ӡ�����û���ַ 4.��ӡ�����û����� 5.��ӡ������ϸ�û���Ϣ");
		System.out.println("��������������˳�������һ�����");
		int i = sc.nextInt();
		switch(i){
		case 1 : for(Usr a:usr){
			System.out.println(a.getid()+"\t"+a.getUserName()+"\t");
		}
				 System.out.println(""); 
				 break;
		case 2 : System.out.println("id"+"\t"+"����"+"\t"+"�Ա�"+"\t");
				 for(Usr a:usr){					
					  System.out.println(a.getid()+"\t"+a.getUserName()+"\t"+a.getSex()+"\t");
				 }
				 System.out.println(""); 
				 break;
		case 3 : System.out.println("id"+"\t"+"����"+"\t"+"��ַ"+"\t");
				 for(Usr a:usr){
					  System.out.println(a.getid()+"\t"+a.getUserName()+"\t"+a.getAdd()+"\t");				
				 }
				 System.out.println(""); 
				 break;
		case 4 :System.out.println("id"+"\t"+"����"+"\t"+"����"+"\t"); 
				for(Usr a:usr){
					System.out.println(a.getid()+"\t"+a.getUserName()+"\t"+a.getPoint()+"\t");
				}
				 System.out.println(""); 
				 break;
		case 5 : System.out.println("id"+"\t"+"����"+"\t"+"�Ա�"+"\t"+"סַ"+"\t"+"����"+"\t");
				 for(Usr a:usr){
					 System.out.println(a.getid()+"\t"+a.getUserName()+"\t"+a.getSex()+"\t"+a.getAdd()+"\t"+a.getPoint()+"\t");
				 }
				 break;
		default : flag = false;
				  break;
		}
	}

}

	
	public static void chooseUser(Usr[] usr,int id){
		System.out.println("������ѡ����û���"+usr[id-1].getUserName()+"��������в���");
		
		operation(usr[id-1]);
		
		
	}

	public static void operation(Usr usr){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ѡ����Ҫ�������еĲ�����1.��������  2.�����Ա�  3.����סַ 4.�̳�����");
		int i = sc.nextInt();
		switch(i){
		case 1 : System.out.println("��������Ҫ���ĵ�����");
				 String name = sc.next();
				 usr.setUserName(name);
				 System.out.println("�����ڵ�������"+usr.getUserName());
				 operation(usr);
				 break;
		case 2 : System.out.println("��������Ҫ���ĵ��Ա�");
				 String sex = sc.next();
				 usr.setSex(sex);
				 System.out.println("�����ڵ��Ա���"+usr.getSex());
				 operation(usr);
				 break;
		case 3 : System.out.println("��������Ҫ���ĵ�סַ");
				 String add = sc.next();
				 usr.setAdd(add);
				 System.out.println("�����ڵ�סַ��"+usr.getAdd());
				 operation(usr);
				 break;
		case 4 : System.out.println("��������Ҫ�������ӻ��֣�");
		     	 shopping(usr);
		     	 operation(usr);
		     	 break;
		case 5 : break;
				 
		
		}
		
	}
	public static void shopping(Usr usr){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ����ʲô��1.��ɡ  2.����  3.ñ��");
		int p = usr.getPoint();
		int i = sc.nextInt();
		switch(i){
		case 1 : System.out.println("�㹺�������ɡ�����ּ�10");
				 p+=10;
				 usr.setPoint(p);
				 break;
		case 2 : System.out.println("�㹺��������£����ּ�5");
				 p+=5;
				 usr.setPoint(p);
			     break;
		case 3 : System.out.println("�㹺�����ñ�ӣ����ּ�15");
				 p+=15;
				 usr.setPoint(p);
		         break;
		}
		
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return id+"\t"+userName+"\t"+sex+"\t"+add+"\t"+point+"\t";
//	}
	

}
