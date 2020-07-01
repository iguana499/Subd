package subd.entity;




import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class AutoRepair {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String repair_type;

    private Date date_repair;
    @ManyToOne
    private Worker worker;
    @ManyToOne
    private ComponentsInStock componentsInStock;
    @ManyToOne
    private Cars cars;
    public String toString() {
        return "Auto_repair {\n" +
                "id =" + id + ",\n" +
                "repair_type=" + repair_type + ",\n" +
                "date_repair=" + date_repair + ",\n" +
                "}" + "\n";
    }
}
