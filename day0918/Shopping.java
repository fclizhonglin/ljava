package day0918;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "admin";
		String password = "123456";
		Scanner sc = new Scanner(System.in);
		Usr[] usr = {new Usr(1,"李雷","男","下沙",50),new Usr(2,"韩梅梅","女","拱墅",100),new Usr(3,"大白","不明","西湖",200)};
		System.out.println("欢迎来到用户管理界面，请登录~");
		System.out.print("请输入超级用户名：");
		String name = sc.next();
		System.out.print("请输入密码：");
		String psw = sc.next();
		
		if(name.equals(username)&&psw.equals(password)){
			boolean flag = true;
			while(flag){
				System.out.println("登入成功请对你的用户进行管理操作。");
				System.out.println("1.用户信息  2.用户操作");
				int i = sc.nextInt();
				switch(i){
				case 1:Usr.showuser(usr);break;
				case 2:System.out.println("请选择你要操作的用户id：");
					   int id = sc.nextInt();
					   Usr.chooseUser(usr,id);
					   break;
			    default:flag = false;
			    		break;
				}
				
				
				
			}
			}else{
				System.out.println("对不起您的输入有误");
			}
			
		System.out.println("操作结束");
		sc.close();
		return;
		
		
	}

}
