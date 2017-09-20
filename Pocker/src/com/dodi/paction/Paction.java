package com.dodi.paction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dodi.pocker.Pocker;

public class Paction {
	public Scanner sc = new Scanner(System.in);
	public List<Pocker> li = new ArrayList<Pocker>();
	public List<Pocker> perli = new ArrayList<Pocker>();
	public List<Pocker> pcli = new ArrayList<Pocker>();
	String[] color = {"黑桃","红心","方块","梅花"};
	public void shuffle(){
		li.clear();
		perli.clear();
		pcli.clear();
		for(int i = 1;i<14;i++){
			for(int j = 0;j<4;j++){
				Pocker p = new Pocker(color[j],i);
				li.add(p);
			}
		}
	}
	public void deal(){
		for(int i = 0;i<2;i++){
			int a = (int) (Math.random()*li.size());
			perli.add(li.get(a));
			li.remove(a);
			int b = (int) (Math.random()*li.size());
			pcli.add(li.get(b));
			li.remove(b);
		}								
	}
	
	public void show(){
		System.out.println("玩家当前牌面");
		for (Pocker per : perli) {
			System.out.print(per+" ");
		}
		System.out.println();
		System.out.println("电脑当前牌面");
		System.out.print("(*/ω＼*)"+" ");
		for(int i =1;i<pcli.size();i++){
			System.out.print(pcli.get(i)+" ");
		}
		System.out.println();
		
		
	}
	
	/**
	 * 玩家加牌
	 */
	public void addp(){
		int i = (int) (Math.random()*li.size());
		perli.add(li.get(i));
		li.remove(i);
		System.out.println("玩家得到一张牌");
	}
	/**
	 * 电脑加牌
	 */
	public void addc(){
		int i = (int) (Math.random()*li.size());
		pcli.add(li.get(i));
		li.remove(i);
		System.out.println("电脑得到一张牌");
	}
	/**
	 * 玩家加牌判定
	 * @return
	 */
	public boolean judge(){
		if(accountper()<22){
			System.out.println("是否要加牌？");
			String flag=sc.next();
			if(flag.equalsIgnoreCase("y")){
				return true;
			}
		}else{
			System.out.println("哦~你炸了ヾ(◍°∇°◍)ﾉﾞ");
		}
		return false;
	}
	/**
	 * 电脑加牌判定
	 * @return
	 */
	public boolean judgepc(){
		int j=accountpc();
		if(accountper()<22){
			if(j<18){
				return true;
		}else if(j>21){
			System.out.println("电脑炸了！ヾ(◍°∇°◍)ﾉﾞ");
			return false;
		}else{
			return false;
		}
		}
		return false;
		
	}
	
	public int accountper(){
		int account = 0;
		for (Pocker per : perli) {
			int s = per.getPoint();
			if(s>=10){
				s=10;
			}
			account += s;
		}
		
		return account;
	}
	public int accountpc(){
		int account = 0;
		for (Pocker pc : pcli) {
			int s = pc.getPoint();
			if(s>=10){
				s=10;
			}
			account += s;
		}
		
		return account;
	}
	public void balance(){
		int pc= accountpc();
		int per= accountper();
		System.out.println("最终牌组：");
		System.out.println("玩家牌组：");
		for (Pocker poker : perli) {
			System.out.print(poker+ "  ");
		}
		System.out.println();
		System.err.println("玩家点数是："+per);
		System.out.println("电脑牌组：");
		for (Pocker poker : pcli) {
			System.out.print(poker+ "  ");
		}
		System.out.println();
		System.out.println("电脑点数是："+pc);
		if(pc>21&&per<22){
			System.out.println("电脑炸了，玩家赢！");
		}else if(per>pc&&per<22){
			System.out.println("玩家点数大，玩家赢！");
		}else if(per==pc){
			System.out.println("点数一致，电脑赢。");
		}else if(per>21){
			System.out.println("玩家炸了，电脑赢");
		}else{
			System.out.println("电脑点数大，电脑赢");
		}
	}
}
