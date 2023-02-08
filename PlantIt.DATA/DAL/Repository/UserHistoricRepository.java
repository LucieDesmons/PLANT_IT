import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.UserHistoric;

@Repository
public interface UserHistoricRepository extends CrudRepository<Product, Integer> {

}
