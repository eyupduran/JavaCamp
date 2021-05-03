import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		//Doðrulamayý þimdilik yapmadým
		Game game1 = new Game(1, "CS GO", 100);
		Game game2 = new Game(2, "VALORANT", 150);
		Gamer gamer1 = new Gamer(10, "Eyüp", "Duran", new Game[] { game1,game2});
		Campaign campaign1 = new Campaign(100, "Bahar Kampanyasý", " 05-04-2021");

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		System.out.println("------------------------------");
		GamerManager gamerManager = new GamerManager();
		gamerManager.update(gamer1);
		System.out.println("------------------------------");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		System.out.println("------------------------------");
	
		SaleManager saleManager=new SaleManager();
		saleManager.saleWithCampaign(game2, campaign1);
		System.out.println("------------------------------");
		saleManager.saleGame(game1);
		
	}

}
