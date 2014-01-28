package basic.sorts;
import basic.util.StdRandom;

@SuppressWarnings({"rawtypes"}) 
public class QuickSort {
	
	
	public static int partition(Comparable[] arr, int low, int high){
		
		int low_ptr = low;
		int high_ptr = high + 1;
		
		while(true){
			while( SortUtil.less(arr[++low_ptr], arr[low] ) )
				if(low_ptr == high)
					break;
			
			while( SortUtil.less( arr[low], arr[--high_ptr]) )
				if(high_ptr == low)
					break; 
			
			if(low_ptr >= high_ptr)
				break;
			
			SortUtil.exchg(arr, high_ptr, low_ptr);
			
		}
		
	SortUtil.exchg(arr, low, high_ptr);	
	return high_ptr;
		
	}

	
	public static void quickSort(Comparable[] arr, int low, int high){
		
		if(high <= low)
			return;
		int pivot = partition(arr, low, high);
		quickSort(arr, low, pivot - 1);
		quickSort(arr, pivot + 1, high);
	}
	
	public static void quickSort(Comparable[] arr){
		
		StdRandom.shuffle(arr);
		quickSort(arr, 0, arr.length - 1);
		
	}
	
	
public static void main(String args[]){
		
		Integer[] a = {5,8,4,9,10};
		quickSort(a);
		
		for (Integer e : a){
			
			System.out.println(e);
		}
	}

}
