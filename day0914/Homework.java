package day0914;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[12];
		int temp=0;
		int nmb=arr.length;
		for(int x=0;x<12;x++){
			int a = (int) (Math.random()*100)+1;
			arr[x] = a;
		}
		System.out.println("排序前：");
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println("");
		for(int j=0;j<nmb-1;j++){//比较次数较之数量少一。
			for(int i=0;i<nmb-1-j;i++){//外层循环每跑一次少一次比较。
				
				if(arr[i]>arr[i+1]){
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("输出的是：");
		for(int i:arr){
			System.out.print(i+" ");
		}
			
			
		
	}

}
