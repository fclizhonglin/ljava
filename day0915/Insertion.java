package day0915;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[12];
		for(int i = 0; i<12;i++){
			int a = (int) (Math.random()*100+1);
			arr[i] = a;
		}
		
		for(int i :arr){
			System.out.print(i+" ");
		}
		System.out.println("");
		
		 for (int i = 1; i < arr.length; i++)
         {
             if (arr[i - 1] > arr[i])
             {
                 int temp = arr[i];
                 int j = i;
                 while (j > 0 && arr[j - 1] > temp)
                 {
                     arr[j] = arr[j - 1];
                     j--;
                 }
                 arr[j] = temp;
             }
         }
		for(int i :arr){
			System.out.print(i+" ");
		}
		
	}

}
