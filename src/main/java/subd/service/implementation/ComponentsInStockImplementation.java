package subd.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import subd.entity.AutoRepair;
import subd.entity.ComponentsInStock;
import subd.models.OffsetablePageRequest;
import subd.repository.ComponentsInStockRepository;
import subd.service.serviceInterfaces.ComponentsInStockService;


import java.util.List;
import java.util.Optional;
@Service
public class ComponentsInStockImplementation implements ComponentsInStockService {
    @Autowired
    private ComponentsInStockRepository componentsInStockRepository;
    @Override
    public ComponentsInStock addComponentsInStock(ComponentsInStock componentsInStock) {
    ComponentsInStock savedComponentsInStock = componentsInStockRepository.saveAndFlush(componentsInStock);
        return savedComponentsInStock;
    }

    @Override
    public void delete(int id) {
        componentsInStockRepository.deleteById(id);
    }

    @Override
    public Optional<ComponentsInStock> getById(int id) {

        return componentsInStockRepository.findById(id);
    }

    @Override
    public ComponentsInStock editComponentsInStock(ComponentsInStock componentsInStock) {

        return componentsInStockRepository.saveAndFlush(componentsInStock);
    }

    @Override
    public List<ComponentsInStock> getAll() {

    return componentsInStockRepository.findAll();
    }
    @Override
    public List<ComponentsInStock> getAll(int offset, int count) {

        return componentsInStockRepository.findAll(new OffsetablePageRequest(offset,count)).toList();
    }
}
