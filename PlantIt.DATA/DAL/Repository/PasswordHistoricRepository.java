import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.PasswordHistoric;

@Repository
public interface PasswordHistoricRepository extends CrudRepository<Product, Integer> {

}
