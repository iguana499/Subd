package subd.entity;




import javax.persistence.*;
import java.util.Date;

@Entity
public class VehicleInspection {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date date_inspection;
    @ManyToOne
    private Cars cars;

    public String toString() {
        return "VehicleInspection {\n" +
                "id =" + id + ",\n" +
                "date_inspection=" + date_inspection + ",\n" +
                "}" + "\n";
    }
}
