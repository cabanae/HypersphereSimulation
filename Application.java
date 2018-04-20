import java.util.Scanner;
public class Application {

	// Main entry point
	public static void main(String args[]) {
		Application simApp = new Application();
		simApp.printMenu();
		int userChoice = simApp.getInputChoice();
		while(userChoice!=1||userChoice!=2)
		{
			if(userChoice==1)
			{
				//simApp.getInputMonte();
				MonteCarlo monteSim =  new MonteCarlo(simApp.dimension,simApp.samples,simApp.points); //user input into monteCarlo Simulation
				monteSim.runSim(); // run the simulation
			}
			else if(userChoice==2)
			{
				//simApp.getInputIntegration();
				Integration integrationSim =  new Integration(simApp.dimension,simApp.K); //user input into Integration Simulation
				integrationSim.runSim(); // run the simulation
			}
			else
				return; //exit
			//get user info again
			simApp.printMenu();
			userChoice = simApp.getInputChoice();
		}		
	}
	private int choice;
	private int dimension;
	private int samples;
	private int K;
	private int points;
	//default constructor
	Application()
	{
		choice = 1;
		dimension = 1;
		samples = 100;
		K=10;
	}
	public void printMenu()
	{
		System.out.println("Choose method");
		System.out.println("1. Monte Carlo Volume");
		System.out.println("2. Cube-Based Integration Volume");
		System.out.println("3. Exit");
	}
	public int getInputChoice()
	{
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		choice = reader.nextInt(); // Scans the next token of the input as an int.
		
		if(choice == 3) //if we exit early
			return choice;
		System.out.println("Enter Dimension");
		dimension = reader.nextInt(); // Scans the next token of the input as an int.
		
		if(choice==1) //get input for monte carlo sim
		{
			System.out.println("Enter Sample Size");
			samples = reader.nextInt();
			reader.nextLine();
			System.out.println("Enter Number of Points");
			points = reader.nextInt();
			
		}
		else if(choice==2)
		{
			System.out.println("Enter K cubes");
			K = reader.nextInt();
			
		}
		
		return choice;
	}
}
