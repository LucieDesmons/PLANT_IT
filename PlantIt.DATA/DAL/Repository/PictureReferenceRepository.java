import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.PictureReference;

@Repository
public interface PictureReferenceRepository extends CrudRepository<Product, Integer> {

}
