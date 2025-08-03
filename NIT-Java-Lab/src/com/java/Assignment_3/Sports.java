package com.java.Assignment_3;

class Sports{

	private String sportName;
	private int teamSize ;
	private String sportType = "Unknown" ;
	
	public Sports() {
		
	}
	public Sports(String sportName, int teamSize) {
		this.sportName = sportName ;
		if(teamSize <=0)
			System.err.println("Team  size must be positive. ");
		else
			this.teamSize = teamSize;
	}
	public Sports(String sportName, int teamSize,String sportType) {
		this.sportName = sportName ;
	
		if(teamSize <=0)
			System.err.println("Team  size must be positive. ");
		else
			this.teamSize = teamSize;
		this.sportType = sportType;
	}
	public void displayInfo() {
		if(teamSize > 0) {
		System.out.println("Sport Name is "+sportName);
		
		System.out.println("Team Size is "+teamSize);
		System.out.println("Sport Size is "+sportType);}
		else {
			System.err.println("Error");
		}
	}
}
