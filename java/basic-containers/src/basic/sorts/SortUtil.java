package basic.sorts;

@SuppressWarnings({"rawtypes" ,"unchecked"}) 

public class SortUtil {
	
	public static boolean less(Comparable a, Comparable b){
		return (a.compareTo(b) < 0 );
	};
	
	public static void exchg(Comparable[] a, int i, int j){
		
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static boolean isSorted(Comparable[] a, int high, int low) {
		
		for(int i = low + 1; i <= high; ++i){
			
			if(less(a[i], a[i-1]))
				return false;
		}
		return true;
	}
	
	
	
	
	

}
