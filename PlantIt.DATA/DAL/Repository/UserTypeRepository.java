import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.UserType;

@Repository
public interface UserTypeRepository extends CrudRepository<Product, Integer> {

}
