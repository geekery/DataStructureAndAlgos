package basic.sorts;



@SuppressWarnings({"rawtypes"}) 
public class MergeSort {
	
	
	private static void merge(Comparable[] arr, Comparable[] aux, int low, int mid, int high){
		
		for(int i = low; i <= high; i++)
			aux[i] = arr[i];
		
		int i = low;
		int j = mid+1; 
		
		for(int k = low; k <= high; ++k){
			
			if(i > mid) 								arr[k] = aux[j++];
			else if(j > high) 							arr[k] = aux[i++];
			else if(SortUtil.less(aux[i], aux[j]))		arr[k] = aux[i++];
			else										arr[k] = aux[j++]; 
			
		}
		
		//assert(SortUtil.isSorted(arr, high, low));
	}
	
	
	public static void mergeSort(Comparable[] arr, Comparable[] aux,int low, int high){
		
		if(high <= low)
			return; 
		int mid = low + (high - low) / 2;
		
		
		mergeSort(arr, aux, low, mid);
		mergeSort(arr, aux, mid + 1, high);
		if(SortUtil.less(arr[mid], arr[mid+1])) return;
		merge(arr, aux, low, mid, high);
		
	}
	
	
	public static void mergeSort( Comparable[] arr){
		
		Comparable[] aux = new Comparable[arr.length];
		mergeSort(arr, aux, 0, arr.length - 1);
		
	}
	public static void main(String args[]){
		
		Integer[] a = {5,8,4,8,9,10};
		linearMergeSort(a);
		
		for (Integer e : a){
			
			System.out.println(e);
		}
	}
	
	//Write non recursive 
	
	
/*
 * i = 0
 * sz = 1
 * 
 * sz = 1; sz < N ; sz = sz + sz
 * 
 *  int low = 0; low < N - sz; low
 * 
 * 
 * 
 */

	public static void linearMergeSort(Comparable[] arr){
		
		//Merge operation begins with size = 1
		//and done with chunks that are of size width | | |
		//The last merge is with N/2 size
		
		Comparable[] aux = new Comparable[arr.length];
		for(int i = 0; i < arr.length; ++i)
			aux[i] = arr[i];
		
		for(int size = 1; size < arr.length; size = 2 * size ){
			for (int low = 0; low < arr.length - size; low += 2*size)
				merge(arr, aux, low, low + size -1, Math.min(low + 2*size - 1, arr.length - 1) );
		}
		

	}
}
