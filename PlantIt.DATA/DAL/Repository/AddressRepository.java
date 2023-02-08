import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Product, Integer> {

}
