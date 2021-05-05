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
			System.out.println("Mernis do�rulama ba�ar�l�");
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kullan�c� kay�t oldu.");
		}
		else {
			System.out.println("Kullan�c� bilgileri hatal�");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kullan�c� kay�t g�ncellendi.");		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kullan�c� kay�t silindi.");
	}

}
