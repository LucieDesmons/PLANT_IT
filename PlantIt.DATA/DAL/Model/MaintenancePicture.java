import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "maintenancepicture")
public class MaintenancePicture {

    @Column(name = "Maintenance_idMaintenance")
    private int maintenanceIdMaintenance;

    @Column(name = "Picture_idPicture")
    private int PictureIdPicture;

    /***** GETTER & SETTER *****/

    public int getMaintenanceIdMaintenance() {
        return maintenanceIdMaintenance;
    }

    public void setMaintenanceIdMaintenance(int maintenanceIdMaintenance) {
        this.maintenanceIdMaintenance = maintenanceIdMaintenance;
    }

    public int getPictureIdPicture() {
        return PictureIdPicture;
    }

    public void setPictureIdPicture(int pictureIdPicture) {
        PictureIdPicture = pictureIdPicture;
    }

}