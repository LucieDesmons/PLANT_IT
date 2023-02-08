import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.MaintenanceUser;

@Repository
public interface MaintenanceUserRepository extends CrudRepository<Product, Integer> {

}
