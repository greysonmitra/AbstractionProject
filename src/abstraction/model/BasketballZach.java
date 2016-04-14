package abstraction.model;

import javax.swing.JOptionPane;
import ctec.controller.SportsController;

public class BasketballZach extends Sports
{
	
	private String TeamName;
	private String Place;
	private Long PointsScored;
		

	public BasketballZach()
	{
		this.setTeamName("Utah Jazz");
		this.setPointsScored(111);
		this.setPlace("Vivint Arena");

	}


	public BasketballZach(SportsController baseController)
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
			JOptionPane.showMessageDialog(null, "This sport is fun." );
		}

		}
		

	public int cost()
	{
		return 500;
	}

	public void EthanBradberry(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{
				JOptionPane.showMessageDialog(null, "IM ETHAN BRADBERRY");
		}
			
	}
}
