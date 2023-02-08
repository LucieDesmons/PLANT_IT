import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMaintenance")
    private int idMaintenance;

    @Column(name = "predictedDate")
    private int predictedDate;

    @Column(name = "realizedDate")
    private int realizedDate;

    @Column(name = "report")
    private String report;


    /***** GETTER & SETTER *****/

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public int getPredictedDate() {
        return predictedDate;
    }

    public void setPredictedDate(int predictedDate) {
        this.predictedDate = predictedDate;
    }

    public int getRealizedDate() {
        return realizedDate;
    }

    public void setRealizedDate(int realizedDate) {
        this.realizedDate = realizedDate;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

}