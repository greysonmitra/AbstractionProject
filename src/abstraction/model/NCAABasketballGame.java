package abstraction.model;

public class NCAABasketballGame extends Basketball
{
	
	
	public NCAABasketballGame()
	{
		super();
		
		this.setCourtName("Cameron Indoor Stadium");
		this.setBall(true);
		this.setTeamSizes(5);
		this.setTeamNames("Duke vs. Kentucky");
	}
}
