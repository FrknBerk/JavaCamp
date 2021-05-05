package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()),
customer.getFirstName(), customer.getLastName(), customer.getDateOfBirthday().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch(RemoteException e) {
			  e.printStackTrace();
		  }
		return  result;
	}

}
