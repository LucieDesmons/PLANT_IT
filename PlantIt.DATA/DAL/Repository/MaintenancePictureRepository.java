import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.MaintenancePicture;

@Repository
public interface MaintenancePictureRepository extends CrudRepository<Product, Integer> {

}
