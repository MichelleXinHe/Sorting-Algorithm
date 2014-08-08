public class Selection {
	public static int selection(int[] a, int k){
		if(a==null|a.length<k||k<=0) return 0;
		int r=-1;
		int s=0, e=a.length-1;
		while(s<=e){
			r=partition(a, s, e);
			if(r+1==k) return a[r];
			else if(r+1<k){
				s=r+1;
			}else{
				e=r-1;
			}
		}
		return a[r];
	}
	
	public static int partition(int[] nums, int s, int e){
		int pivot=nums[e];
		int end=e-1;
		for(;s<=end; s++){
			if(nums[s]>pivot){
				int temp=nums[end];
				nums[end]=nums[s];
				nums[s]=temp;
				s--;
				end--;
			}
		}
		//after for loop, s=end+1, otherwise the loop will continue
		nums[e]=nums[s];
		nums[s]=pivot;
		return s;
	}
	
	public static void main(String[] args) {
		//int[] a={1, 13, 11, 10, 9, 7, 4, 6, 5, 3, 2, 15};
		int[] a={1, 2};
		for(int i=1; i<=a.length; i++)
		System.out.println(selection(a, i));
	}

}
