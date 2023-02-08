import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.User;

@Repository
public interface UserRepository extends CrudRepository<Product, Integer> {

}
