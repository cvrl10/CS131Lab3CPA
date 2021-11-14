package arraylist;

/**
 * This class represents a PointThreeD object
 * 
 * @author carla
 * Programming Lab 3
 * CS 131-ON
 * Fall 2021
 */
public class PointThreeD 
{
private double xPoint;
private double yPoint;
private double zPoint;
	
	/**
	 * 
	 * sets instance variable to default 0, the origin
	 */
	public PointThreeD()
	{
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
	}//end empty-argument constructor 
	
	/**
	 * 
	 * @param xPoint
	 * @param yPoint
	 * @param zPoint
	 */
	public PointThreeD(double xPoint, double yPoint, double zPoint)
	{
		this.xPoint = xPoint;
		this.yPoint = yPoint;
		this.zPoint = zPoint;
	}//end preferred constructor
	
	/**
	 * 
	 * @return a String representation of instance field
	 */
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString	
}//end class
