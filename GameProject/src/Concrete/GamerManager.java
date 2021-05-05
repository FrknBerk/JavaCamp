package Concrete;

import Abstract.CustomerCheckService;
import Abstract.GamerService;
import Entities.Customer;
import Entities.Gamer;

public class GamerManager implements GamerService {
	CustomerCheckService customerCheckService;
	public GamerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void register(Gamer gamer,Customer customer) {
		// TODO Auto-generated method stub
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Mernis doðrulama baþarýlý");
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kullanýcý kayýt oldu.");
		}
		else {
			System.out.println("Kullanýcý bilgileri hatalý");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kullanýcý kayýt güncellendi.");		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kullanýcý kayýt silindi.");
	}

}
