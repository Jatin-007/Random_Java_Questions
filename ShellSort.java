class ShellSort {
	public static void main(String args[] ) {
		int[] intArray = {2, 14, 5, 6, 1, -7, 22, 8, 50};
		
		for(int gap = intArray.length/2; gap > 0 ; gap = gap / 2 ){
			int i = gap;
			int j = (gap - i);
			
			while(i > 0 && i < intArray.length - 1){
				if(intArray[j] > intArray[i]){
					swap(intArray, j, i);
				}
				i++;
			}
		}
		
		for(int k=0; k < intArray.length; k ++ ){
			System.out.println(intArray[k]);
		}
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}