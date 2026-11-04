//Programmer: Javan Graber
//Date: 11/3/26

package javanproject;
import java.util.Scanner;


public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    
    //Create the function that converts various temperatures (I will leave the other options there still to
    //demonstrate the functionality of the same method for different purposes)
    static double convertFromCelcius(String to, double temp) {
		double answer = temp;
		if (to.charAt(0) == 'f') {
			answer = (9.0 / 5) * answer + 32;
		}
		if (to.charAt(0) == 'r') {
			answer = (9.0 / 5) * answer + 492;
		}
		if (to.charAt(0) == 'k') {
			answer = answer + 273;
		}
		return answer;
	}
    
    
    public static void main(String[] args)  {

		//Initialize the variables
		String name;
		double density;
		double melt;
		double boil;
		double hardness;
		
		//Initialize the go variable to "f" because we will always be going to Fahreheit
		String goTo = "f";
		
		System.out.println("Welcome to the metal conversion program!");
		
		//Get the number of metals
		System.out.println("Enter the number of metals would you like to input: ");
		int number = userinput.nextInt();
		userinput.nextLine();
		
		//Create the array that will store the information
		String [][] materials;
		materials = new String[number][5];
		
		//For each metal...
		for (int i = 0; i < number; i++) {
			System.out.println();
			System.out.println("Metal #" + (i + 1));
			//Get the name and add it to the array
			System.out.println("Please enter the metal name: ");
			name = userinput.nextLine();
			materials [i][0] = name;
			
			//Get the density and add it to the array
			System.out.println("Please enter the metal density (in g/cm^3): ");
			density = userinput.nextDouble();
			userinput.nextLine();
			materials [i][1] = String.valueOf(density);
			
			//Get the Celsius melting point from the user
			System.out.println("Please enter the melting point (in Celsius at standard pressure): ");
			melt = userinput.nextDouble();
			userinput.nextLine();
			//Convert the Celsius melting point to Fahrenheit by calling the method and add it to the array
			double newMelt = convertFromCelcius(goTo, melt);
			materials [i][2] = String.valueOf(newMelt);
			
			//Get the Celsius boiling point from the user
			System.out.println("Please enter the boiling point (in Celsius at standard pressure): ");
			boil = userinput.nextDouble();
			userinput.nextLine();
			//Convert the Celsius boiling point to Fahrenheit by calling the method and add it to the array
			double newBoil = convertFromCelcius(goTo, boil);
			materials [i][3] = String.valueOf(newBoil);
			
			//Get the hardness and add it to the array
			System.out.println("Please enter the hardness (on a scale of 0 to 10): ");
			hardness = userinput.nextDouble();
			userinput.nextLine();
			materials [i][4] = String.valueOf(hardness);
		}
		
		//Display the array information in an organized way
		System.out.println("           Name         Density       Melting (℉)   Boiling (℉)    Hardness");
		
		for (int i = 0; i < number; i++) {

			System.out.format("%15s%15s%15s%15s%15s", materials [i][0], materials [i][1], materials [i][2], materials [i][3], materials [i][4]);
			System.out.println();
			
		}
		
    }
    	
    }
