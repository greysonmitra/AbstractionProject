package abstraction.model;

public abstract class Basketball
{

	//Three Data Members
	private boolean ball; 
	private boolean basket;
	private String courtName;
	private String teamNames;
	
	
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
