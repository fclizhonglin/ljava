package pocketmon;

public class Pikachu {
private String name = "Pikachu";
private int life = 50;
private int love = 0;



public Pikachu() {
	super();
	// TODO Auto-generated constructor stub
}

public Pikachu(String name, int life, int love) {
	super();
	this.name = name;
	this.life = life;
	this.love = love;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
//public int getLife() {
//	return life;
//}
//public void setLife(int life) {
//	this.life = life;
//}
//public int getLove() {
//	return love;
//}
//public void setLove(int love) {
//	this.love = love;
//}

public void play(){
	if(life>5){
		life-=5;
	    love+=10;
	    System.out.println("你的皮卡丘"+name+"玩的很开心，体力值-5，亲密度+10。");
	    System.out.println("目前的体力值为:"+life+",目前的亲密度是："+love);

	}else{
		System.out.println("你的皮卡丘现在的体力为："+life+"。已经没有精神继续玩耍。");
	}
	
}
public void feed(){
	if(life<100){
		life+=10;
		if(life>100){
			life = 100;
		}
		love+=10;
		System.out.println("你的皮卡丘"+name+"正在进食,体力+10,亲密度+10");
		System.out.println("目前的体力值为:"+life+",目前的亲密度是："+love);
	}else{
		life =100;
		System.out.println("你的皮卡丘已经饱了，请不要继续喂食。");
	}
	
}
public void flash(){
	if(life>5){
		life-=5;
		System.out.println("你的皮卡丘"+name+"正在放电，体力下降5！");
		System.out.println("目前的体力值为:"+life+",目前的亲密度是："+love);
	}else{
		love-=20;
		System.out.println("你的皮卡丘失去战斗能力！亲密度减少20");
	}
	
}
}
