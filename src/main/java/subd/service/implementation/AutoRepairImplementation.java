package subd.service.implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import subd.entity.AutoRepair;
import subd.models.OffsetablePageRequest;
import subd.repository.AutoRepairRepository;
import subd.service.serviceInterfaces.AutoRepairService;

import java.util.List;
import java.util.Optional;
@Service
public class AutoRepairImplementation implements AutoRepairService {
    @Autowired
    private AutoRepairRepository autoRepairRepository;
    @Override
    public AutoRepair addAutoRepair(AutoRepair autoRepair) {
        AutoRepair savedAutoRepair = autoRepairRepository.saveAndFlush(autoRepair);
        return savedAutoRepair;
    }

    @Override
    public void delete(int id) {
        autoRepairRepository.deleteById(id);
    }

    @Override
    public Optional<AutoRepair> getById(int id) {
        return autoRepairRepository.findById(id);
    }

    @Override
    public AutoRepair editAutoRepair(AutoRepair autoRepair) {

        return autoRepairRepository.saveAndFlush(autoRepair);
    }

    @Override
    public List<AutoRepair> getAll() {

        return autoRepairRepository.findAll();
    }
    @Override
    public List<AutoRepair> getAll(int offset, int count) {

        return autoRepairRepository.findAll(new OffsetablePageRequest(offset,count)).toList();
    }
}
