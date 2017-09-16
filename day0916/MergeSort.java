package day0916;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[12];
		for(int i = 0;i<12;i++){
			int a = (int) (Math.random()*100+1);
			arr[i] = a;
		}
		System.out.println("当前的排序是：");
		for(int a :arr){
			System.out.print(a+" ");
		}
		System.out.println("");
		mergeSort(arr);
		System.out.println("整理后的排序是：");
		for(int a :arr){
			System.out.print(a+" ");
		}
		
	}
	/*整合完整排序 */
	public static void mergeSort(int[] data){
		sort(data,0,data.length -1 );
	}
	
	
	
	/*排序，为递归函数。*/
	public static void sort(int[] data, int left,int right){
		/*如果条件成立跳出函数*/
		if(left >= right){
			return;
		}
		/*找出中间索引*/
		int center = (left+right)/2;
		/*对左边数组进行递归排序*/
		sort(data,left,center);
		/*对右边边数组进行递归排序*/
		sort(data,center+1,right);
		/*合并*/
		merge(data,left,center,right);
		
	}
	public static void merge(int[] data,int left,int center,int right){
		/*临时数组*/
		int[] tmpArr = new int[data.length];
		/*右数组的第一个下标*/
		int mid = center +1;
		/*记录临时数组的索引*/
		int third = left;
		/*缓存左数组第一个元素的索引*/
		int tmp = left;
		
		while(left<=center&&mid<=right){
			/*从两个数组中取出最小的放入临时数组*/
			if (data[left] <= data[mid]) {  
					tmpArr[third++] = data[left++];  
	            } else {  
	                tmpArr[third++] = data[mid++];  
	            }  
		}
		/*剩余部分一次放入临时数组*/
		
		//mid为右数组的第一个下标
		while(mid <= right){
			tmpArr[third++] = data[mid++];
		}
		/*center为左数组的第一个下标*/
		while(left <= center){
			tmpArr[third++] = data[left++];
		}
		 // 将临时数组中的内容拷贝回原数组中  
        // （原left-right范围的内容被复制回原数组）  
		while(tmp <= right){
			data[tmp] = tmpArr[tmp++];
		}
		
	}

}
