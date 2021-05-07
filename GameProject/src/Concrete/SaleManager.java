package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;

public class SaleManager implements SaleService {

	@Override
	public void saleWithCampaign(Game game, Campaign campaign) {
		System.out.println(game.getName() +" oyunu satýþýna " + campaign.getName() +  " baþarýyla uygulandý.");
		
	}

	@Override
	public void saleGame(Game game) {
		System.out.println(game.getName() + " : satýþ basarýyla uygulandý");
		
	}

}
