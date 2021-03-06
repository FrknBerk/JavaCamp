package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Bilgiler Yanl??!");
		}
		
	}
	
}
