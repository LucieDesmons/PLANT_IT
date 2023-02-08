import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.Maintenance;

@Repository
public interface MaintenanceRepository extends CrudRepository<Product, Integer> {

}
