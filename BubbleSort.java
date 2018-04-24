class BubbleSort {
	public static void main(String args[]) {
		// Bubble Sort with an implementation of ShellSort in it
		
		int[] intArray = {2, 10, 23, 3, -7, 6, 15, 1, 55, 24, -6};
		
		for(int gap = intArray.length / 2; gap > 0; gap/=2 ){
			
			for(int i = intArray.length - 1; i > 0; i--){
				for(int j = 0; j < i; j ++){
					if(intArray[j] > intArray[j+1]){
						swap(intArray, i, j);
					}
				}
			}
		}
		
		for(int i=0; i < intArray.length; i++){
			System.out.println(intArray[i]);
		}
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}