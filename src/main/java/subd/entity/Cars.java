package subd.entity;




import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String brand;
    private String model;
    private Date production_date;
    private String license_plate;
    private String engine;
    private Integer power;
    private Integer volume_truck;
    private Integer weight_min;
    private Integer weight_max;
    private Integer fuel_cons_min;
    private Integer fuel_cons_max;
    @OneToMany
    private List<AutoRepair> autoRepair;
    @OneToMany
    private List<VehicleInspection> vehicleInspection;
    public String toString() {
        return "Cars {\n" +
                "id =" + id + ",\n" +
                "brand=" + brand + ",\n" +
                "model=" + model + ",\n" +
                "production_date=" + production_date + ",\n" +
                "license_plate=" + license_plate + ",\n" +
                "engine=" + engine + ",\n" +
                "power=" + power + ",\n" +
                "volume_truck=" + volume_truck + ",\n" +
                "weight_min=" + weight_min + ",\n" +
                "weight_max=" + weight_max + ",\n" +
                "fuel_cons_min=" + fuel_cons_min + ",\n" +
                "fuel_cons_max=" + fuel_cons_max + ",\n" +
                "}" + "\n";
    }
}
