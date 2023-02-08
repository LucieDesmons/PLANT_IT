import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.PlantReference;

@Repository
public interface PlantReferenceRepository extends CrudRepository<Product, Integer> {

}
