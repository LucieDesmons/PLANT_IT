import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "conversation")
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConversation")
    private int idConversation;

    @Column(name = "User_id1")
    private int UserId1;

    @Column(name = "User_id2")
    private int UserId2;

    /***** GETTER & SETTER *****/

    public int getIdConversation() {
        return idConversation;
    }

    public void setIdConversation(int idConversation) {
        this.idConversation = idConversation;
    }

    public int getUserId1() {
        return UserId1;
    }

    public void setUserId1(int userId1) {
        UserId1 = userId1;
    }

    public int getUserId2() {
        return UserId2;
    }

    public void setUserId2(int userId2) {
        UserId2 = userId2;
    }

}