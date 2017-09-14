package day0914;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
//		int[] arr1 ={1,2,3,4,5,6};
		String[] arr2={"1213","4564654","78979","asaaa"};
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
//		System.out.println("arr[1]里的数是"+arr[1]);
//		for(int i=0;i<arr1.length;i++){
//			System.out.print(arr1[i]+" ");
//		}
	
		for(String str:arr2){
			System.out.println(str);
		}
		int count = (int) (Math.random()*arr2.length);
		System.out.println(arr2[count]);
	}

}
