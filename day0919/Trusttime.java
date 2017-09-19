package day0919;

public class Trusttime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		String str = "aa";
		StringBuffer sb = new StringBuffer("aa");
		for(int i =0;i<100000;i++){
//			str+="bb";
//			str.concat("bb");
			sb.append("aa");
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
