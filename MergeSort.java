/*
 * Algorithm sorting
 * 
 * Author: Xin He (xh2176@columbia.edu)
 */
public class MergeSort {
	public static void mergeSort(int[] nums){
		int n=nums.length;
		mergeSort(nums, 0, n-1);
	}
	
	public static void mergeSort(int[] nums, int s, int e){
		//when s==e, it is the base case, that only one element in the partition
		if(s>=e) return;
		int mid=(s+e)/2;
		mergeSort(nums, s, mid);
		mergeSort(nums, mid+1, e);
		merge(nums, s, e, mid);
	}
	
	public static void merge(int[] nums, int s, int e, int m){
		//temp is used to store the sorted sub array of nums from index s to index e
		int[] temp=new int[e-s+1];
		//these two are the start index of the left and right sub arrays respectively
		int leftStart=s;
		int rightStart=m+1;
		//index that points to temp array
		int i=0;
		
		//sorting until one of the left and the right part is empty
		while(leftStart<=m&&rightStart<=e){
			if(nums[leftStart]<nums[rightStart]){
				temp[i]=nums[leftStart];
				leftStart++;
			}else{
				temp[i]=nums[rightStart];
				rightStart++;
			}
			i++;
		}
		
		//only when the left part remains, copy the rest from the left to temp array
		//since we are going to 
		while(leftStart<=m){
			temp[i]=nums[leftStart];
			leftStart++;
			i++;
		}
		
		for(int j=0; j<i;j++){
			nums[s]=temp[j];
			s++;
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
		
		mergeSort(array1);
		mergeSort(array2);
		mergeSort(array3);
		mergeSort(array4);
		mergeSort(array5);
		mergeSort(array6);
		
		print(array1);
		print(array2);
		print(array3);
		print(array4);
		print(array5);
		print(array6);
	}

}
