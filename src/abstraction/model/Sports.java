package abstraction.model;

public abstract class Sports implements CoolThing, Comparable
{
	//Three data members

	private String teamName;
	private String place;
	private long pointsScored;

	
	
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
	
	
	/**

	* @return the place

	*/

	public String getPlace()
	{

	return place;

	}

	/**

	* @param place the place to set

	*/

	public void setPlace(String place)
	{

	this.place = place;

	}

	/**

	* @return the teamName

	*/

	public String getTeamName()
	{

	return teamName;

	}

	/**

	* @return the pointsScored

	*/

	public long getPointsScored()
	{

	return pointsScored;

	}

	/**

	* @param teamName the teamName to set

	*/

	public void setTeamName(String teamName)
	{

	this.teamName = teamName;

	}

	/**

	* @param pointsScored the pointsScored to set

	*/

	public void setPointsScored(long pointsScored)
	{

	this.pointsScored = pointsScored;

	}
}