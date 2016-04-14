package abstraction.model;

import abstraction.controller.*;
import javax.swing.JOptionPane;


public class NBABasketballGame extends Basketball
{
	public NBABasketballGame()
	{
		this.setCourtName("Oracle Arena");
		this.setBall(true);
		this.setTeamSizes(5);
		this.setTeamNames("Warriors vs. 76ers");
		
	}
	
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
	
	public NBABasketballGame(BasketballController baseController)
	{

	}
	
	public double coolnessLevel()
	{
		return 20;
	}
	
	public void coolAction(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{
			JOptionPane.showMessageDialog(null, "GO WARRIORS WOO");
		}
	}
	
	public int cost()
	{
		return 1000;
	}
	
	public void EthanBradberry(int numberOfTimes)
	{
		JOptionPane.showMessageDialog(null, "IM ETHAN BRADBERRY");
	}
}
