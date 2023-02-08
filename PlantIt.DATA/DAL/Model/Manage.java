import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "manage")
public class Manage {

    @Column(name = "User_idCustomer")
    private int userIdCustomer;

    @Column(name = "User_idBotanist")
    private int userIdBotanist;

    @Column(name = "Start_date")
    private int startDate;

    @Column(name = "End_date")
    private int endDate;

    /***** GETTER & SETTER *****/

    public int getUserIdCustomer() {
        return userIdCustomer;
    }

    public void setUserIdCustomer(int userIdCustomer) {
        this.userIdCustomer = userIdCustomer;
    }

    public int getUserIdBotanist() {
        return userIdBotanist;
    }

    public void setUserIdBotanist(int userIdBotanist) {
        this.userIdBotanist = userIdBotanist;
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

}