package com.dodi.card;

import java.util.Scanner;

import com.dodi.ex.Exp;

public class Abc extends Card{
	Scanner sc = new Scanner(System.in);
	public Abc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Abc(String name, int account, String password) {
		super(name, account, password);
		// TODO Auto-generated constructor stub
	}
	
		
	
	@Override
	public void save(int i) throws Exp {
		if(i<0){
			throw new Exp("你存的钱不能是负数");
		}else if(i%100!=0){
			throw new Exp("对不起只能存入100的整钞");
		}else{
			int a = this.getAccount()+i;
			this.setAccount(a);
			System.out.println("操作已成功");
		}
		
	}

	@Override
	public void take(int i) throws Exp {
		// TODO Auto-generated method stub
		if(i>this.getAccount()){
			throw new Exp("对不起你的余额不足");
		}else if(i%100!=0){
			throw new Exp("对不起只能取出100的整钞");
		}else{
			int a = this.getAccount() - i;
			this.setAccount(a);
			System.out.println("操作已成功");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName()+"余额为"+getAccount();
	}

	@Override
	public void login() throws Exp {
		// TODO Auto-generated method stub
		System.out.println("请输入你的用户名：");
		String name = sc.next();
		System.out.println("请输入你的密码：");
		String psd = sc.next();
		if(name.equals(this.getName())&&psd.equals(this.getPassword())){
			System.out.println("登录成功");
		}else{
			throw new Exp("你的用户名密码有误，请稍后再试");
		}
		
	}
	public void chose(){
		System.out.println("欢迎来到银行操作系统，请选择你接下来的操作。1.存钱           2.取钱           3.显示余额        4.退出");
		int a = sc.nextInt();
		switch(a){
		case 1 : System.out.println("欢迎来到存钱操作");
				 System.out.println("请输入你要存入的金额");
				 int sm = sc.nextInt();
				 try {
					 this.save(sm);
				 } catch (Exp e) {
					 e.printStackTrace();
				 };
				 this.chose();break;
		case 2 : System.out.println("欢迎来到取钱操作");
				 System.out.println("请输入你要取出的金额");
				 int tm = sc.nextInt();
				 try {
				 	this.take(tm);
				 } catch (Exp e) {
				 	e.printStackTrace();
				 };
				 this.chose();break;
		case 3 : this.show();this.chose(); break;
		case 4 : System.out.println("操作结束");break;
		}
	}
	public void show(){
		System.out.println(this);
	}

}
