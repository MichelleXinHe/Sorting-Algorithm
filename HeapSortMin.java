public class HeapSortMin {
	
	public static void heapsort(int[] a){
		if(a==null) return;
		buildHeap(a);
		for(int i=0; i<a.length;i++){
			int temp = a[0];
			a[0] = a[a.length-1-i];
			a[a.length-1-i] = temp;
			heapify(a, a.length-1-i, 0);		
		}
	}
	
	public static void heapify(int[] a, int length, int index){
		if(a==null) return;		
		//if it is not a leaf
		//since before the max swap with this node, it stands as one of the leaves
		while(index<=length/2){
			int smaller=-1;
			//notice the range of larger: may exceed the length
			if(2*index+2<=length-1){
				if(a[2*index+1]<a[2*index+2]) smaller=2*index+1;
				else smaller=2*index+2;
			}else if (2*index+1<=length-1){
				smaller = 2*index+1;
			}else break;
			
			//no need to search to the leaf level if current node is already 
			//larger then two children
			if(a[index]>a[smaller]){
				int temp =a[index];
				a[index]=a[smaller];
				a[smaller]=temp;
				index=smaller;
			} else break;
		}
	}
	
	//build a heap is :O(n) time complexity
	public static void buildHeap(int[] a){
		//heapify the first half elements
		for(int i = a.length/2; i>=0;i--)
			heapify(a, a.length,i);
	}
	
	public static void main(String[] args){
		
		int[] a ={1, 13, 11, 10, 9, 7, 4, 6, 5, 3, 2, 15};
		for(int i: a){
			System.out.print(i+" ");
		}
		System.out.println();
		heapsort(a);
		for(int i: a){
			System.out.print(i+" ");
		}
		
		System.out.println();

		int[] newarray = {1, 3, 4, 5, 6, 2, 8, 10, 23};
		buildHeap(newarray);
		
		for(int i: newarray){
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
}
