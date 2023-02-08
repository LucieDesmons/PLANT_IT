import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "referencepicture")
public class ReferencePicture {

    @Column(name = "PlantReference_idPlantReference")
    private int PlantReferenceIdPlantReference;

    @Column(name = "PictureReference_idPictureReference")
    private int PictureReferenceIdPictureReference;

    /***** GETTER & SETTER *****/

    public int getPlantReferenceIdPlantReference() {
        return PlantReferenceIdPlantReference;
    }

    public void setPlantReferenceIdPlantReference(int plantReferenceIdPlantReference) {
        PlantReferenceIdPlantReference = plantReferenceIdPlantReference;
    }

    public int getPictureReferenceIdPictureReference() {
        return PictureReferenceIdPictureReference;
    }

    public void setPictureReferenceIdPictureReference(int pictureReferenceIdPictureReference) {
        PictureReferenceIdPictureReference = pictureReferenceIdPictureReference;
    }

}