package model;

enum Team{
	
	Scuderia Ferrari, Mclaren Fi Team, Red Bull Racing, Mercedes Amg, Racing Point, Alfa Romeo, Renault, Williams
	
}

public class Championship{
	
	//constant
	private final static int drivers = 15;
	
	//Atributes
	private int year;
	private int races;
	
	//Relations
	public Pilots[] pilot;
	
	//Builder
	public Championship(int xYear, int xRaces){
		
		year = xYear;
		races = xRaces;
		pilot = new Pilots[drivers];
		
	}
	
	/**
    *<b>Name:addPilot</b><br>
    *this method allows to record the information of each pilot.
    *<b>Post:</b> The pilots has been created
    *@param name String. Variable with the name of the pilot. name!=""
    *@param age int. Variable with the age of every pilot. age!=null
    *@param team String. Variable with the team name of each pilot. team!=""
    *@param race[] int. Variable with the amount of time each driver can get in each race. race[]!=null
    *@return message Variable the keeps the information of the new course
    */
	public String addPilot(String name, int age, String team, int race[]){
		String message = "The pilot has been created";
		Pilots objRxist = findPilot(name);
		
	} 
}