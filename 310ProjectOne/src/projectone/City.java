package projectone;

import java.util.HashMap;

//creation of city class 

public class City {
	String name;
	HashMap<String, Integer> connectedCities;

	public City() {
		//list of cities each individual city is connected to 
		connectedCities = new HashMap<String, Integer>();

	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	//hash map storing the connected cities (key = individual city)
	public HashMap<String, Integer> getConnectedCities() {
		return connectedCities;
	}

}
