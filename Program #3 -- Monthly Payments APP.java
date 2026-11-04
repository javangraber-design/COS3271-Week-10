//Programmer: Javan Graber
//Date: 11/3/26

package javanproject;
import java.util.Scanner;


public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    
    //Create the function that calculates the average from a provided list
	static double computePayment(double loanAmt, double rate, int numPeriods) {
		
		//Calculate the monthly interest and months for the loan
		double monthlyInterest = (rate / 12) / 100.0;
		double monthsForLoan = numPeriods * 12;
		
		//Calculate the numerator portion of the loan formula
		double numerator = (Math.pow((1 + monthlyInterest), monthsForLoan)) * monthlyInterest;
		//Calculate the denominator portion of the loan formula
		double denominator = (Math.pow((1 + monthlyInterest), monthsForLoan)) - 1;
		
		
		//Divide the numerator by the denominator and multiply that by the loan amount to find the answer
		double answer = (numerator / denominator) * loanAmt;
		//Return the answer
		return answer;
		}
	//Create the mainline
	public static void main (String[] args){
		//Get the principle, yearly interest rate, and years
		try {
		System.out.println("Welcome to Monthly Mortgage Calculator");
		System.out.print ("\nEnter principle: ");
		double origLoanAmt = userinput.nextDouble();
		System.out.print ("Enter yearly interest rate without percent: ");
		double origYearlyInterest = userinput.nextDouble();
		System.out.print ("Enter number of years: ");
		int origYears = userinput.nextInt();
		
		//Display the monthly payment by calling the method
		System.out.format("\nThe monthly payment is $%.2f", computePayment(origLoanAmt,origYearlyInterest,origYears));
		
		//If an error occurs, display the error message
		} catch (Exception e) {
			System.out.println("Make sure to enter valid numbers, not strings!");
		}
	}
		
}
