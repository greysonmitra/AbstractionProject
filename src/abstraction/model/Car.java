package abstraction.model;

public abstract class Car implements CoolThing
{
	//Three Data Members
	private String modelName;
	private int yearMake; 
	private String brandName;
	
	
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

