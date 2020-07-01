package subd.entity;




import javax.persistence.*;
import java.util.Date;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String target;

    private Date dateToComplete;
    @ManyToOne
    private Clients clients;
    @ManyToOne
    private Worker worker;
    public String toString() {
        return "Route {\n" +
                "id =" + id + ",\n" +
                "target=" + target + ",\n" +
                "dateToComplete=" + dateToComplete + ",\n" +
                "}" + "\n";
    }
}
