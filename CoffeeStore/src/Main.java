import java.sql.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		//Customer customer = new Customer(1,"","",,"");
		Customer customer = new Customer();
		customer.setFirstName("Your FirstName");
		customer.setLastName("Your LastName");
		customer.setId(2);
		customer.setNationalityId("Your Nationalityid");
		customer.setDateOfBirth(new Date(1996,3,26));//Your Date of Birthday
		customerManager.save(customer);
	}
	

}
