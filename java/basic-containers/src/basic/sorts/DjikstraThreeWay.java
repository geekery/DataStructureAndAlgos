package basic.sorts;


@SuppressWarnings({"rawtypes"}) 
public class DjikstraThreeWay {

	
	
	public static void sort(Comparable[] arr, int low, int high){
		
		if(high <= low)
				return;
		
		int lessThan = low; 
		int greaterThan = high; 
		int equals = low;

		Comparable pivot = arr[low];
		
		while( equals <= greaterThan){
			
			@SuppressWarnings("unchecked")
			int comp = arr[equals].compareTo(pivot);
			
			//The element is smaller. Exchange it with location pointed to by lessThan
			if(comp < 0)
				SortUtil.exchg(arr, equals++, lessThan++);
			else if(comp > 0)
				SortUtil.exchg(arr, equals, greaterThan--);
			else
				equals++;
			
		}

		sort(arr, low, lessThan - 1);
		sort(arr, greaterThan + 1, high);
		
		
		
	}
	
	/*
	 * 							lt      gt
	 * 				-----------------------------
	 * 				|V|	 < V	|  =V   | > V
	 * 				-------------------------------
	 * 
	 */
	
	public static void sort(Comparable[] a){
		
		sort(a, 0, a.length - 1);
		
	}
	
public static void main(String args[]){
		
		Integer[] a = {5,8,4,8,5,4,9,11,10,15,14,14,11,15,16,9,10};
	sort(a);
		
		for (Integer e : a){
			
			System.out.println(e);
		}
	}
	

}
