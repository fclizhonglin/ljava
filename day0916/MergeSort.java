package day0916;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[12];
		for(int i = 0;i<12;i++){
			int a = (int) (Math.random()*100+1);
			arr[i] = a;
		}
		System.out.println("��ǰ�������ǣ�");
		for(int a :arr){
			System.out.print(a+" ");
		}
		System.out.println("");
		mergeSort(arr);
		System.out.println("�����������ǣ�");
		for(int a :arr){
			System.out.print(a+" ");
		}
		
	}
	/*������������ */
	public static void mergeSort(int[] data){
		sort(data,0,data.length -1 );
	}
	
	
	
	/*����Ϊ�ݹ麯����*/
	public static void sort(int[] data, int left,int right){
		/*�������������������*/
		if(left >= right){
			return;
		}
		/*�ҳ��м�����*/
		int center = (left+right)/2;
		/*�����������еݹ�����*/
		sort(data,left,center);
		/*���ұ߱�������еݹ�����*/
		sort(data,center+1,right);
		/*�ϲ�*/
		merge(data,left,center,right);
		
	}
	public static void merge(int[] data,int left,int center,int right){
		/*��ʱ����*/
		int[] tmpArr = new int[data.length];
		/*������ĵ�һ���±�*/
		int mid = center +1;
		/*��¼��ʱ���������*/
		int third = left;
		/*�����������һ��Ԫ�ص�����*/
		int tmp = left;
		
		while(left<=center&&mid<=right){
			/*������������ȡ����С�ķ�����ʱ����*/
			if (data[left] <= data[mid]) {  
					tmpArr[third++] = data[left++];  
	            } else {  
	                tmpArr[third++] = data[mid++];  
	            }  
		}
		/*ʣ�ಿ��һ�η�����ʱ����*/
		
		//midΪ������ĵ�һ���±�
		while(mid <= right){
			tmpArr[third++] = data[mid++];
		}
		/*centerΪ������ĵ�һ���±�*/
		while(left <= center){
			tmpArr[third++] = data[left++];
		}
		 // ����ʱ�����е����ݿ�����ԭ������  
        // ��ԭleft-right��Χ�����ݱ����ƻ�ԭ���飩  
		while(tmp <= right){
			data[tmp] = tmpArr[tmp++];
		}
		
	}

}
