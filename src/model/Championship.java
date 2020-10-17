package model;

public class Championship{
	
	//constant
	private final static int drivers = 15;
	
	//Atributes
	private int year;
	private int races;
	
	//Relations
	public Pilot[] pilots;
	
	//Builder
	public Championship(int xYear, int xRaces){
		
		year = xYear;
		races = xRaces;
		pilots = new Pilot[drivers];
		
	}
	
	/**
    *<b>Name:addPilot</b><br>
    *this method allows to record the information of each pilot.
    *<b>Post:</b> The pilots has been created
    *@param name String. Variable with the name of the pilot. name!=""
    *@param age int. Variable with the age of every pilot. age!=null
    *@param team String. Variable with the team name of each pilot. team!=""
    *@param scores[] int. Variable with the amount of time each driver can get in each race. race[]!=null
    *@return message Variable that keeps the information of the new pilot
    */
	public String addPilot(String name, int age, String team, int[] scores){
		
		String message = "The pilot has been created";
		Pilot objExist = findPilot(name);
		boolean out = false;
		
		if(objExist==null){
			for(int i = 0; i < pilots.length && !out; i++){
				if(pilots[i]==null){
					pilots[i]=new Pilot(name, age, team, scores);
					out = true;
				}
			}
			if(out==false)
				message="no more pilots are allowed to register";
		} else {
			message="The pilot is already registered";
		}
		return message;
	}
	
    /**
    *<b>Name:findPilot</b><br>
    *this method allows to find the information of each pilot.
    *<b>Post:</b> The pilots has been found
	*@param name String. Variable with the name of the pilot. name!=""
    *@return Pilot Variable the keeps the pilots
    */
	public Pilot findPilot(String name){
		
		Pilot obj = null;
		boolean found = false;
		
		for(int i = 0; i < pilots.length && !found; i++){
			if (pilots[i]!=null && pilots[i].getName().equals(name)){
				found = true;
				obj = pilots[i];
			}
		}
		return obj;
	}
	
	/**
    *<b>Name:showAverangeTimes</b><br>
    *<b>Post:</b> Show the average time of each pilot's races
    *@return message Show the average time of each pilot's races
    */
	public String showAverangeTimes(){
		
		String out = "";
		
		for(int i = 0; i < pilots.length; i++){
			if(pilots[i]!=null)
				out+="Pilot "+pilots[i].getName()+"\n average time: "+pilots[i].calculateAverage(pilots[i].getScores())+"\n --------------------------------------";
			return out;
		}
		return out;
	}
	
	//Setters and getters
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return year;
	}
	
	public void setRaces(int races){
		this.races=races;
	}
	public int getRaces(){
		return races;
	}
}