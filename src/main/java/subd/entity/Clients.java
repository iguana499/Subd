package subd.entity;



import javax.persistence.*;
import java.util.List;

@Entity
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String adress;

    @OneToMany
    private List<Route> route;

    public String toString() {
        return "Clients {\n" +
                "id =" + id + ",\n" +
                "name=" + name + ",\n" +
                "adress=" + adress + ",\n" +
                "}" + "\n";
    }
}
