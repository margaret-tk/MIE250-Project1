// Your solution to MIE250 Project 1 goes here
// This is the "default package" hence there should be *no* line that starts with "package ...;"
import java.io.*; 

public class FizzBuzz { 
	
	public static BufferedReader userin = new BufferedReader (new InputStreamReader (System.in));	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int f, b, start, end; 
		
	while (true) { //program restarts unless zero is entered 
		System.out.println("   JAVA FIZZBUZZ PROGRAM");
		//system asks for input of f, b, starting number and ending number using buffered reader  	
		System.out.print("Enter Fizz number: ");
		f = getNonNegInt(); //get none negative value of f
		if (f == 0) break; //break if zero
		System.out.print("Enter Buzz number: ");
		b = getNonNegInt(); //get noon negative value of b 
		if (b == 0) break; //break if zero
		System.out.print("Enter starting number: ");
		start =  Integer.parseInt(userin.readLine()); //get start number 
		System.out.print("Enter ending number: ");
		end =  Integer.parseInt(userin.readLine()); 
		while (end < start) { //make sure end is greater than start 
			System.out.print("ERROR: Ending number cannot be less than starting number! Try again:");
			end =  Integer.parseInt(userin.readLine());
		}
		System.out.println();
	 
		//counts and put in fizz, buzz or fizzbuzz where appropriate 
		while (start <= end) { //iterations
			System.out.print(start +". "); 
			if (start % f == 0 && start % b == 0 ) System.out.println("FizzBuzz");
			else if (start % f == 0 ) System.out.println("Fizz");
			else if (start % b == 0) System.out.println("Buzz");
			else System.out.println(start);
			start = start + 1; 
		}
		System.out.println();
	}
	
	System.out.print("\nThe end.");
	}
		
//function to get non negative number 
public static int getNonNegInt() throws NumberFormatException, IOException  {
	int x;
	x = Integer.parseInt(userin.readLine());
	while (x < 0) { //negative number error 
		System.out.print("ERROR: Negative numbers are not allowed! Try again:");
		x = Integer.parseInt(userin.readLine());
	}
	
	return x;
	
}
}
