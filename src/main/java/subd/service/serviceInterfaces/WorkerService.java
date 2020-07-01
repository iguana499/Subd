package subd.service.serviceInterfaces;
import org.hibernate.jdbc.Work;
import org.springframework.stereotype.Service;
import subd.entity.VehicleInspection;
import subd.entity.Worker;

import java.util.List;
import java.util.Optional;
@Service
public interface WorkerService {
    Worker addWorker(Worker worker);
    void delete(int id);
    Optional<Worker> getById(int id);
    Worker editWorker(Worker worker);
    List<Worker> getAll();
    List<Worker> getAll(int offset, int count);
}