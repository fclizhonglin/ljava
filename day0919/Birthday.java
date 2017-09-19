package day0919;

import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("请输入你的身份证号码：");
			
			String fsz = sc.next();
			if(fsz.length()==18||fsz.length()==19){
				String birthday =fsz.substring(6,14);
				String year = birthday.substring(0,4);
				String month = birthday.substring(4,6);
				String day = birthday.substring(6,8);
				System.out.println(year+"-"+month+"-"+day);
				flag = false;
			}else{
				System.out.println("你的输入有误，请重试!");
			}
		}
		sc.close();
		
		
			

		
		
 		
		
		
	}

}
