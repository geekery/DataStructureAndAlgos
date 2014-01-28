package basic.sorts;

@SuppressWarnings({"rawtypes"}) 
public class InsertionSort {
	
	
	/*
	 * 
	 * Invariant
	 * the left part is sorted but not final and the right part has not been visited yet
	 * 
	 */
	
	
	public static void insertionSort(Comparable[] arr){
		
		for(int i = 0; i < arr.length; ++i){
			for (int j = i; j >= 1; --j)
				if( SortUtil.less(arr[j], arr[j - 1] ) )
					SortUtil.exchg(arr, j - 1, j);
				else 
					break;
			
			
		}
		
	}
public static void main(String args[]){
		
		Integer[] a = {5,8,8,4,9,10};
		insertionSort(a);
		
		for (Integer e : a){
			
			System.out.println(e);
		}
	}


}
