/*
 * Algorithm sorting
 * 
 * Author: Xin He (xh2176@columbia.edu)
 */
public class CountSort {
	public static void countSort(int[] nums, int range){
		if(nums==null||nums.length<2) return;
		int[] counter=new int[range];
		for(int n:nums) counter[n]++;
		int index=0;
		for(int i=0; i<range; i++){
			while(counter[i]>0){
				counter[i]--;
				nums[index]=i;
				index++;
			}
		}
	}
	public static void print(int[] array){
		for(int i:array)
			System.out.print(i+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array1={};
		int[] array2={1};
		int[] array3={1, 2, 3, 4};
		int[] array4={4, 3, 2, 1};
		int[] array5={1, 4, 2, 3};
		int[] array6={1, 1, 1, 1};
		
		countSort(array1,0);
		countSort(array2,1);
		countSort(array3,5);
		countSort(array4,5);
		countSort(array5,5);
		countSort(array6,5);
		
		print(array1);
		print(array2);
		print(array3);
		print(array4);
		print(array5);
		print(array6);
	}
}
