package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface SaleService {
   void saleWithCampaign(Game game,Campaign campaign);
   void saleGame(Game game);
	
}
