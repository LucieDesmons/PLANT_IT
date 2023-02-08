import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "plantconversation")
public class PlantConversation {

    @Column(name = "Plant_idPlant")
    private int PlantIdPlant;

    @Column(name = "Conversation_idConversation")
    private int ConversationIdConversation;

    /***** GETTER & SETTER *****/

    public int getPlantIdPlant() {
        return PlantIdPlant;
    }

    public void setPlantIdPlant(int plantIdPlant) {
        PlantIdPlant = plantIdPlant;
    }

    public int getConversationIdConversation() {
        return ConversationIdConversation;
    }

    public void setConversationIdConversation(int conversationIdConversation) {
        ConversationIdConversation = conversationIdConversation;
    }

}