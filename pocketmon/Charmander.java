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
		    System.out.println("���С����"+name+"��ĺܿ��ģ�����ֵ-5�����ܶ�+10��");
		    System.out.println("Ŀǰ������ֵΪ:"+life+",Ŀǰ�����ܶ��ǣ�"+love);

		}else{
			System.out.println("���С�������ڵ�����Ϊ��"+life+"���Ѿ�û�о��������ˣ��");
		}
		
	}
	public void feed(){
		if(life<100){
			life+=10;
			if(life>100){
				life = 100;
			}
			love+=10;
			System.out.println("���С����"+name+"���ڽ�ʳ,����+10,���ܶ�+10");
			System.out.println("Ŀǰ������ֵΪ:"+life+",Ŀǰ�����ܶ��ǣ�"+love);
		}else{
			life =100;
			System.out.println("���С�����Ѿ����ˣ��벻Ҫ����ιʳ��");
		}
		
	}
	public void fire(){
		if(life>5){
			life-=5;
			System.out.println("���С����"+name+"������������½�5��");
			System.out.println("Ŀǰ������ֵΪ:"+life+",Ŀǰ�����ܶ��ǣ�"+love);
		}else{
			love-=20;
			System.out.println("���С����ʧȥս�����������ܶȼ���20");
		}
		
	}
}