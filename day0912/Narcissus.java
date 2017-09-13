package day0912;

public class Narcissus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 100; i<1000; i++){
			int bit = i%10;
			int ten = (i/10)%10;
			int hun = i/100;
			if(i == (Math.pow(bit, 3)+Math.pow(ten, 3)+Math.pow(hun, 3))){
				System.out.println(i);
			}
		}
	}

}
