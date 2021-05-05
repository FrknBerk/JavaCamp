package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " kampanyasý eklendi indirim fiyatý : %"+campaign.getDiscount());
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " kampanyasý güncellendi indirim fiyatý : %"+campaign.getDiscount());
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " kampanyasý silindi indirim fiyatý : %"+campaign.getDiscount());
	}

}
