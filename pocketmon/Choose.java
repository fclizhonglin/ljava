package pocketmon;

import java.util.Scanner;

public class Choose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to the pocketmon world!");
		System.out.println("please choose your partern!");
		System.out.println("1 for pikachu 2 for charmander");
		int ch = sc.nextInt();
		
		switch (ch) {
			case 1:
				boolean flag1 = true;
				System.out.println("ok! you choose the pikachu!");
				Pikachu p = new Pikachu();
				System.out.println("ok!let's set a name for your pocketmon.");
				String pname = sc.next();
				p.setName(pname);
				System.out.println("ok! now your pocketmon named "+pname+"!");
				System.out.println("now let's play with it.");
				
				while(flag1){
					System.out.println("1 for play 2 for feed 3 for flash other numbers for exit");
					int pac = sc.nextInt();
					switch(pac){
					case 1 : p.play();break;
					case 2 : p.feed();break;
					case 3 : p.flash();break;
					default : flag1 = false; System.out.println("you choose to qiut!");break;
					}
				}
				break;				
				
			case 2:
				boolean flag2 = true;
				System.out.println("omg! you choose the charmander!!");
				Charmander c = new Charmander();
				System.out.println("ok!let's set a name for your pocketmon.");
				String cname = sc.next();
				c.setName(cname);
				System.out.println("ok! now your pocketmon named "+cname+"!");
				System.out.println("now let's play with it.");
				while(flag2){
					System.out.println("1 for play 2 for feed 3 for flash other numbers for exit");
					int cac = sc.nextInt();
					switch(cac){
					case 1 : c.play();break;
					case 2 : c.feed();break;
					case 3 : c.fire();break;
					default : flag2 = false; System.out.println("you choose to qiut!");break;
					}
				
													
				}
				break;
			default : System.out.println("OK! you just make a mistake go that way.");
		}
		System.out.println("Thanks for your playing!!");
		sc.close();
	}
}
