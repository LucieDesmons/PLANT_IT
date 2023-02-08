import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMessage")
    private int idMessage;

    @Column(name = "label")
    private String label;

    @Column(name = "updateDate")
    private int updateDate;

    @Column(name = "Conversation_idConversation")
    private int ConversationIdConversation;

    /***** GETTER & SETTER *****/

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(int updateDate) {
        this.updateDate = updateDate;
    }

    public int getConversationIdConversation() {
        return ConversationIdConversation;
    }

    public void setConversationIdConversation(int conversationIdConversation) {
        ConversationIdConversation = conversationIdConversation;
    }

}