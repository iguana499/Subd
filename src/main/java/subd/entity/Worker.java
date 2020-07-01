package subd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String secondName;
    private Integer work_experience;
    private String position;
    private Integer salary;
    @OneToMany
    private List<Route> route;
    @OneToMany
    private List<AutoRepair> autoRepair;


    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String toString() {
        return "Worker {\n" +
                "id =" + id + ",\n" +
                "name=" + name + ",\n" +
                "second_name=" + secondName + ",\n" +
                "work_experience=" + work_experience + ",\n" +
                "position=" + position + ",\n" +
                "salary=" + salary + ",\n" +
                "}" + "\n";
    }
}
