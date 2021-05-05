package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " kampanyas� eklendi indirim fiyat� : %"+campaign.getDiscount());
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " kampanyas� g�ncellendi indirim fiyat� : %"+campaign.getDiscount());
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " kampanyas� silindi indirim fiyat� : %"+campaign.getDiscount());
	}

}
