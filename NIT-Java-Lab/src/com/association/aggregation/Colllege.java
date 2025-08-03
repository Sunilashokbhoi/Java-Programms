package com.association.aggregation;

public class Colllege {
	private String collegeName;
	private String collegeLocation;
	public Colllege(String collegeName, String collegeLocation) {
		super();
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
	}
	@Override
	public String toString() {
		return "Colllege [collegeName=" + collegeName + ", collegeLocation=" + collegeLocation + "]";
	}
	
}
