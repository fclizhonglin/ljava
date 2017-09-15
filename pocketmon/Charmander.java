package pocketmon;

public class Charmander {
	private String name = "Charmander";
	private int life = 50;
	private int love = 0;





	public Charmander() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Charmander(String name, int life, int love) {
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
//		return life;
	//}
	//public void setLife(int life) {
//		this.life = life;
	//}
	//public int getLove() {
//		return love;
	//}
	//public void setLove(int love) {
//		this.love = love;
	//}

	public void play(){
		if(life>5){
			life-=5;
		    love+=10;
		    System.out.println("你的小火龙"+name+"玩的很开心，体力值-5，亲密度+10。");
		    System.out.println("目前的体力值为:"+life+",目前的亲密度是："+love);

		}else{
			System.out.println("你的小火龙现在的体力为："+life+"。已经没有精神继续玩耍。");
		}
		
	}
	public void feed(){
		if(life<100){
			life+=10;
			if(life>100){
				life = 100;
			}
			love+=10;
			System.out.println("你的小火龙"+name+"正在进食,体力+10,亲密度+10");
			System.out.println("目前的体力值为:"+life+",目前的亲密度是："+love);
		}else{
			life =100;
			System.out.println("你的小火龙已经饱了，请不要继续喂食。");
		}
		
	}
	public void fire(){
		if(life>5){
			life-=5;
			System.out.println("你的小火龙"+name+"正在喷火，体力下降5！");
			System.out.println("目前的体力值为:"+life+",目前的亲密度是："+love);
		}else{
			love-=20;
			System.out.println("你的小火龙失去战斗能力！亲密度减少20");
		}
		
	}
}
