package basic.containers;



public class PermuteString {
	
	String[] permutations;
	

		//Swap start with end and call permute of start + 1, end
		
		
	static byte[] swap(byte[] arr, int a, int b){
		
		byte x = arr[a];
		arr[a] = arr[b];
		arr[b] = x;
		return arr;
		
	}
	
	static void permute(byte[] arr, int start, int end){
		
		
		if(start == end)
			System.out.println(new String(arr));
		
		for(int index = start; index <= end; index++){
			arr = swap(arr, start, index); 
			permute(arr, start + 1, end );
			arr = swap(arr, start, index); 
			
		}
	}
		
/*
 * Swap each letter with the first letter and permute the rest of the string recursively. When len(constPart) = len(string) print permute. Each exchange to be restored
 * Then restore each exchange
 */
	public static void main(String[] args){
	
		
		String str = "abcd";
		permute(str.getBytes(), 0, str.length() - 1);
	
	}
}


