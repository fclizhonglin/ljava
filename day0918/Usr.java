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
		System.out.println("请选择您要进行的操作：1.打印您的用户名单  2.打印您的用户性别  3.打印您的用户地址 4.打印您的用户积分 5.打印您的详细用户信息");
		System.out.println("其它任意键用以退出进行下一项操作");
		int i = sc.nextInt();
		switch(i){
		case 1 : for(Usr a:usr){
			System.out.println(a.getid()+"\t"+a.getUserName()+"\t");
		}
				 System.out.println(""); 
				 break;
		case 2 : System.out.println("id"+"\t"+"姓名"+"\t"+"性别"+"\t");
				 for(Usr a:usr){					
					  System.out.println(a.getid()+"\t"+a.getUserName()+"\t"+a.getSex()+"\t");
				 }
				 System.out.println(""); 
				 break;
		case 3 : System.out.println("id"+"\t"+"姓名"+"\t"+"地址"+"\t");
				 for(Usr a:usr){
					  System.out.println(a.getid()+"\t"+a.getUserName()+"\t"+a.getAdd()+"\t");				
				 }
				 System.out.println(""); 
				 break;
		case 4 :System.out.println("id"+"\t"+"姓名"+"\t"+"积分"+"\t"); 
				for(Usr a:usr){
					System.out.println(a.getid()+"\t"+a.getUserName()+"\t"+a.getPoint()+"\t");
				}
				 System.out.println(""); 
				 break;
		case 5 : System.out.println("id"+"\t"+"姓名"+"\t"+"性别"+"\t"+"住址"+"\t"+"积分"+"\t");
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
		System.out.println("现在你选择的用户是"+usr[id-1].getUserName()+"请对他进行操作");
		
		operation(usr[id-1]);
		
		
	}

	public static void operation(Usr usr){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请选择你要对它进行的操作：1.更改姓名  2.更改性别  3.更改住址 4.商城消费");
		int i = sc.nextInt();
		switch(i){
		case 1 : System.out.println("请输入你要更改的名称");
				 String name = sc.next();
				 usr.setUserName(name);
				 System.out.println("你现在的名称是"+usr.getUserName());
				 operation(usr);
				 break;
		case 2 : System.out.println("请输入你要更改的性别");
				 String sex = sc.next();
				 usr.setSex(sex);
				 System.out.println("你现在的性别是"+usr.getSex());
				 operation(usr);
				 break;
		case 3 : System.out.println("请输入你要更改的住址");
				 String add = sc.next();
				 usr.setAdd(add);
				 System.out.println("你现在的住址是"+usr.getAdd());
				 operation(usr);
				 break;
		case 4 : System.out.println("您现在是要购物增加积分！");
		     	 shopping(usr);
		     	 operation(usr);
		     	 break;
		case 5 : break;
				 
		
		}
		
	}
	public static void shopping(Usr usr){
		Scanner sc = new Scanner(System.in);
		System.out.println("请问你需要购买什么：1.雨伞  2.雨衣  3.帽子");
		int p = usr.getPoint();
		int i = sc.nextInt();
		switch(i){
		case 1 : System.out.println("你购买的是雨伞，积分加10");
				 p+=10;
				 usr.setPoint(p);
				 break;
		case 2 : System.out.println("你购买的是雨衣，积分加5");
				 p+=5;
				 usr.setPoint(p);
			     break;
		case 3 : System.out.println("你购买的是帽子，积分加15");
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
