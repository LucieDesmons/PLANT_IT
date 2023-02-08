import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.Manage;

@Repository
public interface ManageRepository extends CrudRepository<Product, Integer> {

}
