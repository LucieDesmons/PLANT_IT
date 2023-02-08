import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.PlantConversation;

@Repository
public interface PlantConversationRepository extends CrudRepository<Product, Integer> {

}
