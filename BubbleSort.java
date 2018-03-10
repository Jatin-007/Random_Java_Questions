import java.util.Scanner;
public class BubbleSort{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		// initializing the array of size 10
		int intArray[] = new int[10];

		// Storing those 10 values in the array defines which is intArray
		System.out.println("Enter 10 double valued unsorted numbers");
		for(int i=0; i<10; i++){
			int enteredNumber = scan.nextInt();
			intArray[i] = enteredNumber;
		}
		
		// Sorting the array
		// Comparing the elements i and i+1 and swap the elements
		// in this way the biggest number shifts to the last of array
		// since the number at position intArray[intArray.length - 1] is shifted to its appropriate positon, we have 1 less element to do work with 
		// same procedure. In this way, we start shifting bigger integers to the right leaving smaller to the left which sorts the array
		for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0 ; lastUnsortedIndex-- ){
			for(int j =0; j < lastUnsortedIndex ; j++){
				if(intArray[j] > intArray[j+1]){
					swap(intArray, j, j +1);
				}
			}
		}
		
		// For loop to display the array 
		for(int i=0; i<10; i++){
			System.out.println(intArray[i]);
		}
	}
	
	// method created to swap the elements
	// if element j is bigger than i but j comes before i, method swap will swap the elements and put j to the right and i to the left
	// swapping is done by using a integer temp to help swap the values
	public static void swap(int[] input, int i, int j){
		if(i == j){
			return ;
		}
		else {
			int temp = input[i];
			input[i] = input[j];
			input[j] = temp;
		}
	}
}