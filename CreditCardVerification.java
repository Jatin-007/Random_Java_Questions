import java.util.Scanner;

public class CreditCardVerification {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner
		
		// asking user to add credit card number
		System.out.print("Enter a credit card number as a long integer: ");
		long number = input.nextLong();

		if(isValid(number)){
			System.out.println(number +" is valid" );
		}
		else {
			System.out.println(number +" is invalid" );
		}
	}
	
	// checkkking if the number is valid or no..
	public static boolean isValid(long number) {
		boolean valid =
			(getSize(number) >= 13 && getSize(number) <= 16) &&
			(prefixMatched(number, 4)) &&
			((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
		return valid;
	}
	
	// getting the sum from even places
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
		}
		return sum;
	}
	
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(num.charAt(i) + "");
		}
		return sum;
	}
	
	// here we are adding the numbers to the single value
	// eg if the total sum is- 25 -> it turns out to be 2 + 5 = 7
	public static int getDigit(int number) {
		if (number < 9)
			return number;
		else
			number = number / 10 + number % 10;
			return number;
	}
	
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}
	
	// number of digits present in the number itself
	public static int getSize(long d) {
		String num = d + "";
		return num.length();
	}
	
	
	public static long getPrefix(long number, int k) {
		if (getSize(number) > k)  {
			String num = number + "";
			return  Long.parseLong(num.substring(0, k));
		}
		return number;
	}
}