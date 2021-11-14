package arraylist;

/**
 * This class represents a Square object
 * 
 * @author carla
 * Programming Lab 3
 * CS 131-ON
 * Fall 2021
 */
public class Square 
{
	private double side;//the side of a Square object
	
	/**
	 * empty-argument constructor
	 */
	public Square()
	{
		this(1);
	}//end empty-argument instructor
	
	/**
	 * 
	 * @param side the side to set
	 */
	public Square(double side)
	{
		this.side = side;
	}//end preferred constructor
	
	/*
	 * 
	 * return area of Square object
	 */
	public double getArea()
	{
		return Math.pow(side, 2);
	}//end getArea
	
	/**
	 * 
	 * @return a String representation of the instance field and area
	 */
	@Override
	public String toString() {
		return "Square [side=" + side + " area=" +getArea()+"]";
	}//end toString	
}//end class
