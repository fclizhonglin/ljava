package day0912;

public class sanweishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int x = 1; x<5;x++){
			for(int y = 1; y<5;y++){
				for(int z = 1;z<5;z++){
					if(x!=y&&x!=z&&y!=x&&y!=z){
						System.out.println(100*x+10*y+z);
						total++;
					}
				}
			}
		}
		System.out.println("共有"+total+"个数");
	}

}
