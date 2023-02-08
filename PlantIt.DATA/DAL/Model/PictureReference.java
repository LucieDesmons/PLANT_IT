import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "picturereference")
public class PictureReference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPictureReference")
    private int idPictureReference;

    @Column(name = "way")
    private String way;

    @Column(name = "modificationDate")
    private int modificationDate;

    /***** GETTER & SETTER *****/

    public int getIdPictureReference() {
        return idPictureReference;
    }

    public void setIdPictureReference(int idPictureReference) {
        this.idPictureReference = idPictureReference;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public int getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(int modificationDate) {
        this.modificationDate = modificationDate;
    }

}