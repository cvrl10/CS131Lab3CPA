package arraylist;

/**
 * This class test a String instance of ArrayList, a Square instance of ArrayList and a PointThreeD instance of ArrayList
 * 
 * @author carla
 * @version 1.0
 * Programming Lab 3
 * CS 131-ON
 * Fall 2021
 */
public class ListApp 
{
	public static void main(String[] args) 
	{
	StringBuilder[] format = new StringBuilder[3];
	
	//ArrayList<String>
	format[0] = new StringBuilder("Instantiating a collection to holds a max of 2 String elements");
	format[0].append("\n______________________________________________________________\n");
	System.out.println(format[0]);

	ArrayList<String> stringList = new ArrayList<>(2);
	System.out.println("adding the first element, this method should return true = "+stringList.addItem("Carl"));
	System.out.println("adding the second element, this method should return true = "+stringList.addItem("Rose"));
	System.out.println("adding the third element, this method should return false since the capcity of this collection is 2 = "+stringList.addItem("Archemetre"));
	
	System.out.println("\nEvoking the toString method of ArrayList<String>: "+stringList.toString());
	System.out.println();
	
	//ArrayList<Square>
	format[1] = new StringBuilder("Instantiating a collection that holds the default capacity of Square elements");
	format[1].append("\n_____________________________________________________________________________\n");
	System.out.println(format[1]);
	
	ArrayList<Square> squareList = new ArrayList<>();
	System.out.println("adding the first square element to the colection: "+squareList.addItem(new Square()));
	System.out.println("adding the second square element to the colection: "+squareList.addItem(new Square(4)));
	System.out.println("adding the third square element to the colection: "+squareList.addItem(new Square(16)));
	
	System.out.println("\nEvoking the toString method of ArrayList<Square>: "+squareList.toString());
	System.out.println();
	
	//ArrayList<PointThreeD>
	format[2] = new StringBuilder("Instantiating a collection that holds the default capacity of PointThreeD elements");
	format[2].append("\n__________________________________________________________________________________\n");
	System.out.println(format[2]);
	
	ArrayList<PointThreeD> point3Dlist = new ArrayList<>();
	System.out.println("adding the first PointThreeD element to the colection: "+point3Dlist.addItem(new PointThreeD()));
	System.out.println("adding the second PointThreeD element to the colection: "+point3Dlist.addItem(new PointThreeD(4, 6, 8)));
	
	System.out.println("\nEvoking the toString method of ArrayList<PointThreeD>: "+point3Dlist.toString());
	System.out.println();
	}//end main
}//end class
