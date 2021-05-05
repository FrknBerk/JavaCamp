package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;

import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					  customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
			  /*result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
						customer.getFirstName(), 
						customer.getLastName(), 
						customer.getDateOfBirth().getYear());*/
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch(RemoteException e) {
			  e.printStackTrace();
		  }
		return  result;
	}

}
