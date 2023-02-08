import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.Plant;

@Repository
public interface PlantRepository extends CrudRepository<Product, Integer> {

}
