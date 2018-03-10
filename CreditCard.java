import java.util.Scanner;
class CreditCard{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the credit Card number");
		// Storing the Credit card number 
		long creditCardNumber = scan.nextLong();
		
		if(isValid(creditCardNumber)){
			// Write the code over here
			System.out.println("------");
		}
		else{
			System.out.println("Sorry the card you added is not a Credit card");
		}
		
	}
	
	// the below method is to validate if the credit card number provided is valid or no
	public static boolean isValid(long number){
		// Calling getSize method to get the number of digits in the credit card provided
		int length = getSize(number);
		
		// Verifying the first number of the credit card
		int firstNum = 0;
		int value = getPrefix(number, firstNum);
		
		if(length > 13 && length < 16){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public static int getSize(long d){
		int length = String.valueOf(d).length();
		return length;
	}
	
	public static long getPrefix(long number, int firstNum){
		// provide the first digit for this number
		// return the number itself if it is smaller than firstNum
	}
}