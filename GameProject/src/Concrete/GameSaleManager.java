package Concrete;

import Abstract.CampaignService;
import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameSaleManager implements GameSaleService{
	@Override
	public void sale(Gamer gamer, Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " oyunu "+ gamer.getFirstName() + " " + gamer.getLastName() + " kullanýcýya "+game.getPrice() + " satýldý.");
	}

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		double discount = (game.getPrice() - game.getPrice() * campaign.getDiscount()/100);
		System.out.println(game.getGameName() + " oyunu "+ campaign.getCampaignName() +" kampanyasýyla " + gamer.getFirstName() + " " + gamer.getLastName() + " kullanýcýya "+ discount+" satýldý.");
	}

}
