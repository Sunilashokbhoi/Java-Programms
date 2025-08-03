package com.has_a_relation.composition;

public class Engine {
	private String engineType;
	private int hoursePower;
	public Engine(String engineType, int hoursePower) {
		super();
		this.engineType = engineType;
		this.hoursePower = hoursePower;
	}
	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", hoursePower=" + hoursePower + "]";
	}
	
}
