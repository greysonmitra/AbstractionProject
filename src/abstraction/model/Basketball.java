package abstraction.model;

public abstract class Basketball implements CoolThing, Comparable
{

	//Three Data Members
	private boolean ball; 
	private boolean basket;
	private String courtName;
	private String teamNames;
	
	
	
	
	public String toString()
	{
		String description = "This is a " + this.getClass().getName() + " and has a cost of: " + cost();
		
		return description;
	}
	
	/**
	 * If the supplied variable compared comes before the calling variable 
	 * return -1.
	 * If the supplied variable is after the calling variable
	 * return 1. 
	 * Else, if they're the same
	 * return 0
	 */
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
	
	public String getTeamNames()
	{
		return teamNames;
	}
	public void setTeamNames(String teamNames)
	{
		this.teamNames = teamNames;
	}
	private int teamSizes;
	
	public boolean hasBall()
	{
		return ball;
	}
	public void setBall(boolean ball)
	{
		this.ball = ball;
	}
	public boolean hasBasket()
	{
		return basket;
	}
	public void setBasket(boolean basket)
	{
		this.basket = basket;
	}
	public String getCourtName()
	{
		return courtName;
	}
	public void setCourtName(String courtName)
	{
		this.courtName = courtName;
	}
	public int getTeamSizes()
	{
		return teamSizes;
	}
	public void setTeamSizes(int teamSizes)
	{
		this.teamSizes = teamSizes;
	}
	
	
	
	
}
