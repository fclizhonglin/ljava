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
		for(int j=0;j<12;j++){
			for(int i=0;i<nmb-1;i++){
				
				if(arr[i]>arr[i+1]){
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
			nmb--;
		}
		System.out.println("Êä³öµÄÊÇ");
		for(int i:arr){
			System.out.print(i+" ");
		}
			
			
		
	}

}
