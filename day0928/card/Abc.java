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
			throw new Exp("����Ǯ�����Ǹ���");
		}else if(i%100!=0){
			throw new Exp("�Բ���ֻ�ܴ���100������");
		}else{
			int a = this.getAccount()+i;
			this.setAccount(a);
			System.out.println("�����ѳɹ�");
		}
		
	}

	@Override
	public void take(int i) throws Exp {
		// TODO Auto-generated method stub
		if(i>this.getAccount()){
			throw new Exp("�Բ����������");
		}else if(i%100!=0){
			throw new Exp("�Բ���ֻ��ȡ��100������");
		}else{
			int a = this.getAccount() - i;
			this.setAccount(a);
			System.out.println("�����ѳɹ�");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName()+"���Ϊ"+getAccount();
	}

	@Override
	public void login() throws Exp {
		// TODO Auto-generated method stub
		System.out.println("����������û�����");
		String name = sc.next();
		System.out.println("������������룺");
		String psd = sc.next();
		if(name.equals(this.getName())&&psd.equals(this.getPassword())){
			System.out.println("��¼�ɹ�");
		}else{
			throw new Exp("����û��������������Ժ�����");
		}
		
	}
	public void chose(){
		System.out.println("��ӭ�������в���ϵͳ����ѡ����������Ĳ�����1.��Ǯ           2.ȡǮ           3.��ʾ���        4.�˳�");
		int a = sc.nextInt();
		switch(a){
		case 1 : System.out.println("��ӭ������Ǯ����");
				 System.out.println("��������Ҫ����Ľ��");
				 int sm = sc.nextInt();
				 try {
					 this.save(sm);
				 } catch (Exp e) {
					 e.printStackTrace();
				 };
				 this.chose();break;
		case 2 : System.out.println("��ӭ����ȡǮ����");
				 System.out.println("��������Ҫȡ���Ľ��");
				 int tm = sc.nextInt();
				 try {
				 	this.take(tm);
				 } catch (Exp e) {
				 	e.printStackTrace();
				 };
				 this.chose();break;
		case 3 : this.show();this.chose(); break;
		case 4 : System.out.println("��������");break;
		}
	}
	public void show(){
		System.out.println(this);
	}

}
