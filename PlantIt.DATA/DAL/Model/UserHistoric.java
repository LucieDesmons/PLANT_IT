import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "userhistoric")
public class UserHistoric {

    @Column(name = "idUserHistoric")
    private int idUserHistoric;

    @Column(name = "startDate")
    private int startDate;

    @Column(name = "endDate")
    private int endDate;

    @Column(name = "User_idUser")
    private int UserIdUser;

    /***** GETTER & SETTER *****/

    public int getIdUserHistoric() {
        return idUserHistoric;
    }

    public void setIdUserHistoric(int idUserHistoric) {
        this.idUserHistoric = idUserHistoric;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public int getUserIdUser() {
        return UserIdUser;
    }

    public void setUserIdUser(int userIdUser) {
        UserIdUser = userIdUser;
    }

}