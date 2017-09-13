package day0912;

public class rabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int little = 0;
		int zero = 1;
		int one = 0;
		int big = 0;
		int total = 0;
		for (int i = 0; i<12;i++){
			big += one;
			one = zero;
			zero = big;
			
		}

		total = big+one+zero;
		little = zero+one;
//		System.out.println(zero);
//		System.out.println(one);
		System.out.println(little);
		System.out.println(big);
		System.out.println(total);
	}

}
