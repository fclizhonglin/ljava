package day0914;

public class Qiuhe {
	public static void main(String[] args){
		double total = 0;
		double x = 1,y =1,z=0,p=0;
		for(int i = 0;i<20;i++){
			
			z=x;
			x+=y;
			y=z;
			p=x/y;
			total+=p;
			
		}
		System.out.println(total);
	}
}
