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
