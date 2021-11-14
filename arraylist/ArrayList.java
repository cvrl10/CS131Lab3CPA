package arraylist;

public class ArrayList<T> 
{
	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  	
  	/**
  	 * 
  	 * @param item
  	 * @return boolean to indicate if item was successfully added
  	 */
	public boolean addItem(T item)
	{
		if (currentItem < arList.length)
			arList[currentItem] = item;
		currentItem++;
		
		return (currentItem <= arList.length)? true : false;
	}//end addItem
	
	/**
	 * 
	 * @return a string representation of the elements in the collection
	 */
	public String toString()
	{
		StringBuilder fmt = new StringBuilder("");
		if (currentItem > 0)
		{
			for(int i = 0; i < arList.length; i++)
				if(arList[i] != null)
					fmt.append(arList[i].toString()+" ");
		}	
		return (currentItem == 0)? null : fmt.toString();
	}//end toString
}//end class
