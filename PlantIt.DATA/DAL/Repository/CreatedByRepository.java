import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.CreatedBy;

@Repository
public interface CreatedByRepository extends CrudRepository<Product, Integer> {

}
