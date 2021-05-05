import java.sql.Date;

import Concrete.CampaignManager;
import Concrete.CustomerCheckManager;
import Concrete.GameSaleManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Furkan Berk");
		gamer.setLastName("Akdaþ");
		gamer.setUserName("Frkn");
		gamer.setEmail("frknbrk@hotmail.com");
		gamer.setPassword("1234");
		
		Customer customer = new Customer();
		customer.setFirstName("Furkan Berk");
		customer.setLastName("Akdaþ");
		customer.setNationaltyId("67762196532");
		customer.setDateOfBirthday(new Date(1996,3,26));
		
		GamerManager gamerManager = new GamerManager(new CustomerCheckManager());
		System.out.println("-----Oyuncu iþlemleri-----");
		gamerManager.register(gamer,customer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("Gta 5");
		game.setPrice(150);
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("Yýlbaþý indirimi");
		campaign.setDiscount(20);
		
		CampaignManager campaignManager = new CampaignManager();
		System.out.println("-----Kampanya-----");
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		GameSaleManager gamesaleManager = new GameSaleManager();
		System.out.println("-----Oyun satýþý-----");
		gamesaleManager.sale(gamer, game);
		gamesaleManager.sale(gamer, game, campaign);
	}

}
