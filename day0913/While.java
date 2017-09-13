package day0913;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(true){
//			System.out.println("哈哈哈哈哈哈哈");
//		}
		for(int i = 0; i<10; i++){
			if(i%2==0){
				continue;/*跳过此次循环继续执行*/
//				break;/*跳出循环*/
//				return;/*跳出这个方法*/
			}
			System.out.println("这是第"+i+"次循环");
		}
		System.out.println("结束");
	}

}
