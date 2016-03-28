package abstraction.model;

public class NBABasketballGame extends Basketball
{
	public NBABasketballGame()
	{
		this.setCourtName("Oracle Arena");
		this.setBall(true);
		this.setTeamSizes(5);
		this.setTeamNames("Warriors vs. 76ers");
	}
}
