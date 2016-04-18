package abstraction.model;

	/**

	 * 

	 * @author Alejandro Magallanes

	 * @version 0.1 Mar 28, 2016

	 */

public abstract class Book implements CoolThing

{

	//Three Data Members

	private String bookName;
	private String mainCharacter;
	private int yearWritten;

	public String toString()
	{
		String description = "This is a " + this.getClass().getName() + " and has a cost of: " + cost();
		
		return description;
	}

	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if( compared instanceof CoolThing) //Tests if the thing on the left IS A thing on the right. AKA is the thing on the left a implemented interface.
		{
			if(this.coolnessLevel() > ((CoolThing) compared).coolnessLevel())
			{
				comparedValue = 1;
			}
			else if(this.coolnessLevel() < ((CoolThing) compared).coolnessLevel())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
	}

	public String getBookName()
	{
		
		return bookName;
	
	}



	public void setBookName(String bookName)

	{

	this.bookName = bookName;

	}



	public int getYearWritten()

	{

	return yearWritten;

	}



	public void setYearWritten(int yearWritten)

	{

	this.yearWritten = yearWritten;

	}


	public String getMainCharacter()

	{

	return mainCharacter;

	}



	public void setMainCharacter(String mainCharacter)

	{

	this.mainCharacter = mainCharacter;

	}



}


