package abstraction.model;

public abstract class Car implements CoolThing
{
	//Three Data Members
	private String modelName;
	private int yearMake; 
	private String brandName;
	
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
	
	public String getModelName()
	{
		return modelName;
	}
	
	public void setModelName(String modelName)
	{
		this.modelName = modelName;
	}
	
	public int getYearMake()
	{
		return yearMake;
	}
	
	public void setYearMake(int yearMake)
	{
		this.yearMake = yearMake;
	}
	
	public String getBrandName()
	{
		return brandName;
	}

	public void setBrandName(String brandName)
	{
		this.brandName = brandName;
	}

}

