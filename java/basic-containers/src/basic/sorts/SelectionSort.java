package basic.sorts;

@SuppressWarnings({"rawtypes"}) 
public class SelectionSort {
	
	public static void selectionSort(Comparable[] arr){
		
		for(int i = 0; i < arr.length; ++i){
			int min = i;
			for(int j = i; j < arr.length; ++j)
				if(SortUtil.less(arr[j], arr[min])){
					min = j;
				SortUtil.exchg(arr, min, i);
			}
		}
		
		
	}
	
public static void main(String args[]){
		
		Integer[] a = {5,8,8,4,9,10};
	selectionSort(a);
		
		for (Integer e : a){
			
			System.out.println(e);
		}
	}



}
