class SelectionSort{
	public static void main(String args[]) {
		int[] intArray = {2, -7, 10, 17, 6, 9, 4, 22};
		
		for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){
			int largest = 0;
			for(int j = 0; j <= lastUnsortedIndex ; j ++){
				if(intArray[j] > intArray[largest]){
					largest = j;
				}
			}
			swap(intArray, largest, lastUnsortedIndex);
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