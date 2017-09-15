package day0915;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[12];
		int nmb = arr.length;
		for(int i = 0; i<12;i++){
			int a = (int) (Math.random()*100+1);
			arr[i] = a;
		}
		
		for(int i :arr){
			System.out.print(i+" ");
		}
		System.out.println("");
		
		for(int i = 0;i < nmb-1;i++){
			for(int j = i+1;j<nmb;j++){
				
				if(arr[j]<arr[i]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				
					}
			}
		}
		for(int i :arr){
			System.out.print(i+" ");
		}
		
	}

}
