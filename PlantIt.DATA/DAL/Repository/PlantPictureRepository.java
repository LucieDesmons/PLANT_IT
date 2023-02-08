import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.PlantPicture;

@Repository
public interface PlantPictureRepository extends CrudRepository<Product, Integer> {

}
