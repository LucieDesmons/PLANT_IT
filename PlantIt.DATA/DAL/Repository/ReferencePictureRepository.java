import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.ReferencePicture;

@Repository
public interface ReferencePictureRepository extends CrudRepository<Product, Integer> {

}
