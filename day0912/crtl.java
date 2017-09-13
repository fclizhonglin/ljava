package day0912;

public class crtl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 0;
		for(int x = 0;x<35;x++){
			y = 35-x;
			if (2*x+4*y == 94){
				System.out.println("有鸡"+x+"只");
				System.out.println("有兔"+y+"只");
			}
		}

	}

}
