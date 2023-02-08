import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "plantpicture")
public class PlantPicture {

    @Column(name = "Plant_idPlant")
    private int PlantIdPlant;

    @Column(name = "Picture_idPicture")
    private int PictureIdPicture;

    /***** GETTER & SETTER *****/

    public int getPlantIdPlant() {
        return PlantIdPlant;
    }

    public void setPlantIdPlant(int plantIdPlant) {
        PlantIdPlant = plantIdPlant;
    }

    public int getPictureIdPicture() {
        return PictureIdPicture;
    }

    public void setPictureIdPicture(int pictureIdPicture) {
        PictureIdPicture = pictureIdPicture;
    }

}