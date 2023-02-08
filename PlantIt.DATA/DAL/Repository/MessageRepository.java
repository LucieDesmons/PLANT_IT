import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Product, Integer> {

}
