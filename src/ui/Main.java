package ui;

import model.Championship;
import java.util.Scanner;

public class Main{
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		Championship champions = championship();
		
		System.out.println("");
		System.out.println("Please enter the information of the pilots");
		
		for(int i = 0; i < 15; i++){
			System.out.println("");
			System.out.println("Pilot "+(i+1));
			
			addPilots(champions);
		}
		
	}
	
	/**
	*<b>Name:championship</b><br>
	*This method allows you to create a new championship
	*@return championshipX All the information of the championship
	*/
	public static Championship championship(){
		
		System.out.println("");
		System.out.println("Please enter the information of the FIA ​​Championship");
		System.out.println("Year: ");
		
		int year = Integer.parseInt(sc.nextLine());
		
		System.out.println("");
		System.out.println("Races: ");
		
		int races = Integer.parseInt(sc.nextLine());
		
		Championship championshipX = new Championship(year, races);
		
		return championshipX;
	}
	
	/**
	*<b>Name:addPilots</b><br>
	*this method allows to record the information of each pilot
	*<b>Post:</b>The pilots has been created
	*@return championshipX Championship object championshipX. championshipX!=null
	*/
	public static void addPilots(Championship championshipX){
		
		System.out.println("");
		System.out.println("Type the name");
		
		String name = sc.nextLine();
		
		System.out.println("");
		System.out.println("type the age");
		
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("");
		System.out.println("Type the team");
		System.out.println("Enter\n"+ 
		"1 for Scuderia Ferrari\n"+
		"2 for Mclaren Fi Team\n"+
		"3 for Red Bull Racing\n"+
		"4 for Mercedes Amg\n"+
		"5 for Racing Point\n"+
		"6 for Alfa Romeo\n"+
		"7 for Renault\n"+ 
		"8 for Williams"
		);
		
		int tm = Integer.parseInt(sc.nextLine());
		
		switch (tm){
			case 1:
			String team = "Scuderia Ferrari";
			break;
			case 2:
			String team = "Mclaren Fi Team";
			break;
			case 3:
			String team = "Red Bull Racing";
			break;
			case 4:
			String team = "Mercedes Amg";
			break;
			case 5:
			String team = "Racing Point";
			break;
			case 6:
			String team = "Alfa Romeo";
			break;
			case 7:
			String team = "Renault";
			break;
			case 8:
			String team = "Williams";
			break;
		}
		
		System.out.println("");
		System.out.println("Type the time in seconds of each of the races");
		
		int[] race = new int[races];
		
		for(int i = 0; i<race.length; i++){
			System.out.println("Race "+(i+1);
			race[i] = Integer.parseInt(sc.nextLine());
		}
		
		String message;
		
		message = championshipX.addPilot(name, age, team, race[]);
		
		System.out.println(message);
		
	}
}