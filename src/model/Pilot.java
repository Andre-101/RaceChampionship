package model;

enum Team{
	
	SCUDERIA_FERRARI, MCLAREN_FI_TEAM, RED_BULL_RACING, MERCEDES_AMG, RACING_POINT, ALFA_ROMEO, RENAULT, WILLIAMS;
	
}

public class Pilot{
	
	//Atributes
	private String name;
	private int age;
	private String team;
	private int[] scores;
	private int sum = 0;
	private double average = 0.0;
	
	//Builder
	public Pilot(String xName, int xAge, String xTeam, int[] xScores){
		
		name = xName;
		age = xAge;
		team = xTeam;
		scores = xScores;
		
	}
	
	/**
    *<b>Name:calculateAverage</b><br>
    *this method allows to calculate the average time of the races of each pilot.
    *<b>Post:</b> The average time of each pilot has been calculated
	*@param scores[] int. Variable with the amount of time each driver can get in each race. scores[]!=null
    *@return double variable that keep the average time of the races of each pilot.
    */
	public double calculateAverage(int[] scores){
		
		for(int i = 0; i < scores.length; i++){
			sum += scores[i];
		}
		average = sum / scores.length;
		
		return average;
		
	}
	
	//setters and getter
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
	public void setScores(int[] scores){
		this.scores = scores;
	}
	public int[] getScores(){
		return scores;
	}
	
	public void setSum(int sum){
		this.sum = sum;
	}
	public int getSum(){
		return sum;
	}
	
	public void setAverage(double average){
		this.average = average;
	}
	public double getAverage(){
		return average;
	}
}