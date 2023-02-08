import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantit.DAL.Model.Conversation;

@Repository
public interface ConversationRepository extends CrudRepository<Product, Integer> {

}
