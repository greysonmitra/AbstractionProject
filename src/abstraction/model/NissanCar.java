package abstraction.model;

import javax.swing.JOptionPane;

public class NissanCar extends Car 
{
	private String modelName;
	private int yearMake;
	private String brandName;
	
	
	public NissanCar()
	{

		super();
		this.setModelName("Skyline R34 GT-R");
		this.setYearMake(2002);
		this.setBrandName("Nissan");
	}



	public double coolnessLevel()
	{	
		return  9002;
	}

	public void coolAction(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{
			JOptionPane.showMessageDialog(null, "This car is cool." );
		}
	}

	public int cost()
	{
		return 20000;
	}

	public void EthanBradberry(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{
			JOptionPane.showMessageDialog(null, "I'm Ethan Bradberry!!!!!!!");
		}
	}

}
