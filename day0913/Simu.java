package day0913;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class Simu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*下例为一个结构语句的简单运用，制作一个仿登入小程序。*/
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<3;i++){
			System.out.println("请输入你的用户名：");
			String usr = sc.next();
			System.out.println("请输入你的密码");
			String pwd = sc.next();
			if(usr.equals("admin")){
				if(pwd.equals("123")){
					System.out.println("登入成功！");
					i=3;
				}else{
					System.out.println("你输入的密码不正确！");
					if(i<2){
						System.out.println("你还有"+(2-i)+"次机会");
					}else{
						System.out.println("登入失败");
					}
				}
			}else{
				System.out.println("你的用户名不存在~");
				if(i<2){
					System.out.println("你还有"+(2-i)+"次机会");
				}else{
					System.out.println("登入失败");
				}
			}
		}
		sc.close();
		
		
		/*下例错误理解*/
//		for(int i = 0; i<3; i++){
//			System.out.println("请输入你 的账户：");
//			Scanner zh = new Scanner(System.in);
//			String yh = zh.next();
//			System.out.println("请输入你的密码：");
//			Scanner mm = new Scanner(System.in);
//			String pw = mm.next();
//			if(yh.equals("admin")&&pw.equals("123456")){
//				System.out.println("恭喜登录成功！！");
//				break;
//			}else{ 
//				if(i<2){
//					System.out.println("请重试~");
//				}else{
//					System.out.println("登入失败");
//				}
//				
//			}
//			
//		}
		
	}

}
