package projectone;

import java.util.Comparator;

public class CityComparator implements Comparator<City> {

	public CityComparator() {
		// TODO Auto-generated constructor stub
	}
	
	//custom comparator to compare two cities by alphabetical order
	@Override
	public int compare(City o1, City o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
