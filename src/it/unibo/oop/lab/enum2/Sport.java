/**
 * 
 */
package it.unibo.oop.lab.enum2;
import it.unibo.oop.lab.enum2.Place;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
//	BASKET(5, "Basket", Place.INDOOR),
//	VOLLEY(6, "Volleyball", Place.INDOOR),
//	TENNIS(2, "Tennis", Place.OUTDOOR),
//	BIKE(1, "Bike", Place.OUTDOOR),
//	F1(1, "Formula 1", Place.OUTDOOR),
//	MOTOGP(1, "Moto GP", Place.OUTDOOR),
//	SOCCER(11, "Football", Place.OUTDOOR);
	
	BASKET(Place.INDOOR, 5, "Basket"),
	VOLLEY(Place.INDOOR,6, "Volleyball"),
	TENNIS(Place.OUTDOOR, 2, "Tennis"),
	BIKE(Place.OUTDOOR, 1, "Bike"),
	F1(Place.OUTDOOR, 1, "Formula 1"),
	MOTOGP(Place.OUTDOOR, 1, "Moto GP"),
	SOCCER(Place.OUTDOOR, 11, "Football");

	/*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final int numberMembers;
	private final String name;
	private final Place place;
	
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
    Sport(final Place place, final int numberMembers, final String name) {
		this.numberMembers = numberMembers;
		this.name = name;
		this.place = place;
	}
    
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
    public boolean isIndividualSport() {
    	return this.numberMembers == 1;
    }
    
    public boolean isIndoorSport() {
    	return this.place == Place.INDOOR;
    }
    
    public Place getPlace() {
    	return this.place;
    }
    
    public String toString() {
    	return "this enum Sport = [" + this.place + ", " + this.numberMembers + ", " + this.name + "]";
    }
}
