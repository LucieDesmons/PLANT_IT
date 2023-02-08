import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.Picture;

@Repository
public interface PictureRepository extends CrudRepository<Product, Integer> {

}
