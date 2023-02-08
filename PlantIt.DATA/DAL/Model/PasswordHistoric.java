import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "passwordhistoric")
public class PasswordHistoric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHistoric")
    private int idHistoric;

    @Column(name = "password")
    private String password;

    @Column(name = "updateDate")
    private int updateDate;

    @Column(name = "User_idUser")
    private int UserIdUser;

    /***** GETTER & SETTER *****/

    public int getIdHistoric() {
        return idHistoric;
    }

    public void setIdHistoric(int idHistoric) {
        this.idHistoric = idHistoric;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(int updateDate) {
        this.updateDate = updateDate;
    }

    public int getUserIdUser() {
        return UserIdUser;
    }

    public void setUserIdUser(int userIdUser) {
        UserIdUser = userIdUser;
    }

}