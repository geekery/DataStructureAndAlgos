package basic.sorts;

@SuppressWarnings({"rawtypes"}) 
public class ShellSort {
	
	public static void shellSort(Comparable[] arr){
		
		//Using Knuth's sequence. This is a modified version of insertion sort with varying strides
		
		int stride = 1;
		int numElems = arr.length;
		
		while ( stride < numElems / 3)
			stride = 3 * stride  + 1; 
		
		
		//The inerstion sort with stride logic
		
		while (stride >= 1) {

			for (int i = stride; i < numElems; i++) {
				for (int j = i; j >= stride
						&& SortUtil.less(arr[j], arr[j - stride]); j -= stride)
					SortUtil.exchg(arr, j, j - stride);
			
			}
		
			stride = stride / 3 ; 
		}
	}
	
	
	public static void main(String args[]){
		
		Integer[] a = {5,8,8,4,9,10};
		shellSort(a);
		
		for (Integer e : a){
			
			System.out.println(e);
		}
	}

}
