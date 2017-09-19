package day0919;

public class Acounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaddddasdasasas";
		int s = 0;
		for(int i=0;i<str.length();i++){
			if ((str.charAt(i))=='a'){
				s+=1;
			}
			
		}
		System.out.println(s);
	}

}
