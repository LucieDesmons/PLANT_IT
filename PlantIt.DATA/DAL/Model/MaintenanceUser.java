import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "maintenanceuser")
public class MaintenanceUser {

    @Column(name = "Maintenance_idMaintenance")
    private int maintenanceIdMaintenance;

    @Column(name = "User_idUser")
    private int UserIdUser;

    /***** GETTER & SETTER *****/

    public int getMaintenanceIdMaintenance() {
        return maintenanceIdMaintenance;
    }

    public void setMaintenanceIdMaintenance(int maintenanceIdMaintenance) {
        this.maintenanceIdMaintenance = maintenanceIdMaintenance;
    }

    public int getUserIdUser() {
        return UserIdUser;
    }

    public void setUserIdUser(int userIdUser) {
        UserIdUser = userIdUser;
    }

}