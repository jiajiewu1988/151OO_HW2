package cs151.hw2.ex4_12;

/**
 * To create country object
 */
public class Country {
	private String name;
	private Double area;
	
	/**
	 * Coustructs a country
	 * @param aName the name of the country
	 * @param aArea the area of the country
	 */
	public Country(String aName, Double aArea) {
		name = aName;
		area = aArea;
	}
	
	/**
	 * Get the name of the country
	 * @return country name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get the area of the country
	 */
	public Double getArea() {
		return area;
	}
}
