public class Pi{
	public static void main(String args[]){
		double start = 1;
		double end = 901;
		System.out.println("\ni     	    m(i)");
		System.out.println("__________________________");
		
		for(start = 1; start <=end; start += 100){
			System.out.printf("%-12.0f", start);
			System.out.printf("%-6.4f\n", valueOfPi(start));
		}
		
	}
	
	public static double valueOfPi(double j){
		double sum =0; 
		for(double i =1; i <= j; i++){
			sum += Math.pow(-1, i+1)/ (2 * i -1);
		}
		sum *= 4;
		return sum;
	}
}

// HOW IT WORKS ?? // ALGORITHM
/**
MAIN METHOD
initiating the value of start =1 and not 0 as it will 
turn out to be negative and value of pi is positive

using for loop to print out the value of start and calculated value of Pi by
calling the method defined- valueOfPi(start) taking start value and calculating the appropriate
result. 

The method valueOfPi returns sum as the appropriate value of start!
the main method then displays the value start and the calculated
value of start

*/