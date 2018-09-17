// Your solution to MIE250 Project 1 goes here
// This is the "default package" hence there should be *no* line that starts with "package ...;"
import java.io.*; 

public class FizzBuzz { 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// variables 
		int f, b, start, end ;
		BufferedReader userin = new BufferedReader (new InputStreamReader (System.in));
	//

	//boolean shouldContinue = true;
		
	while (true) { //program restarts unless zero is entered 
	
		System.out.println("   JAVA FIZZBUZZ PROGRAM");
		//system asks for input of f, b, starting number and ending number using buffered reader  	
		System.out.print("Enter Fizz number: ");
		f = Integer.parseInt(userin.readLine());
		if (f == 0) { // break out of while loop
			//shouldContinue = false; 
			break;
		}
		while (f < 0) { //negative number error 
			System.out.print("ERROR: Negative numbers are not allowed! Try again:");
			f = Integer.parseInt(userin.readLine());	
		}
		
		System.out.print("Enter Buzz number: ");
		b = Integer.parseInt(userin.readLine());
		if (b == 0) {
			//shouldContinue = false; 
			break;
		}
		
		while (b < 0) { //negative number error 
			System.out.print("ERROR: Negative numbers are not allowed! Try again:");
			b = Integer.parseInt(userin.readLine());	
		}
		System.out.print("Enter starting number: ");
		start =  Integer.parseInt(userin.readLine());
		
		System.out.print("Enter ending number: ");
		end =  Integer.parseInt(userin.readLine());
		

		while (end < start) {
			System.out.print("ERROR: Ending number cannot be less than starting number! Try again:");
			end =  Integer.parseInt(userin.readLine());
		}
		System.out.println();
	 //variable for for loop 
		
	// prints sequential numbers starting at starting number ; check if each is divisible by f or b or f*b
	//uses f and b from bufferedreader
	//if divisible by f, print fizz
	//if divisible by b, print buzz
	//if divisible by both, print FizzBuzz
	//end at ending number 
	//doing this with a loop 
		
		
		while (start <= end) { //number of iterations is 
			System.out.print(start +". ");
		if (start % f == 0 && start % b == 0 ) {
			System.out.println("FizzBuzz");
		}
		else if (start % f == 0 ) {
			System.out.println("Fizz");
		}
		else if (start % b == 0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(start);
		}
		start = start + 1; 
	}
		System.out.println();
	}
	
	System.out.print("\nThe end.");
	}
		
	//error is negative number entered or if end number is smaller than start number
	
		
	

	
}
