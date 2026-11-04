//Programmer: Javan Graber
//Date: 11/3/26

package javanproject;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    
    //Create the function that calculates the average from a provided list
    static double calculateAverage(List<String> newNumberList) {
		System.out.println("Here is the number list you provided: " + newNumberList);
		
		//Initialize the sum and the number that will be added to the sum
		int sum = 0;
		int newNumber;
		
		//Go through each value in the list
		for (int i = 0; i < newNumberList.size(); i++) {
			
			//Try to convert the value to an integer and add it to the list
			try {
				newNumber = Integer.parseInt(newNumberList.get(i));
				sum += newNumber;
				
			//If one of the values in the list is not an integer, catch the error and tell the user
			} catch (NumberFormatException e) {
				System.out.println("Sorry, one of the values you entered into the list was not an integer!");
				System.out.println("The resulting output will not be accurate! Make sure to only give integers!");
			}
			
		}
		//Find the average and return it
		double average = sum / Double.valueOf(newNumberList.size());
		return average;
	}
    
    //Create the mainline
    public static void main(String[] args)  {
    	System.out.println("Welcome to the Average Calculator!");
		//Create the list
		List<String> numberList = new ArrayList<>();
		
		//Initialize the loop
		String cont = "";
		
		//Go until the user enters "n"
		while (!cont.equals("n")) {
			//Ask for the value and add it to the list unless the value is "n"
			System.out.println("Please enter an integer to add to the list (or type n to stop): ");
			String addition = userinput.nextLine();
			
			if (addition.equals("n")) {
				cont = addition;
			} else {
				numberList.add(addition);
			}
			
			
		}
		//Get the average from the method and display it
		double newAverage = calculateAverage(numberList);
		System.out.format("The average of the values is: %.2f", newAverage);
	}
		
    	
}
