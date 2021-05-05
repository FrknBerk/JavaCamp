package Abstract;

import Entities.Customer;
import Entities.Gamer;

public interface GamerService {
	void register(Gamer gamer,Customer customer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
