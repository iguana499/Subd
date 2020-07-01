package subd.service.serviceInterfaces;
import org.springframework.stereotype.Service;
import subd.entity.AutoRepair;
import subd.entity.ComponentsInStock;

import java.util.List;
import java.util.Optional;
@Service
public interface ComponentsInStockService {
    ComponentsInStock addComponentsInStock(ComponentsInStock componentsInStock);
    void delete(int id);
    Optional<ComponentsInStock> getById(int id);
    ComponentsInStock editComponentsInStock(ComponentsInStock componentsInStock);
    List<ComponentsInStock> getAll();
    List<ComponentsInStock> getAll(int offset, int count);
}