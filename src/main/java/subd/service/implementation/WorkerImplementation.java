package subd.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import subd.entity.VehicleInspection;
import subd.entity.Worker;
import subd.models.OffsetablePageRequest;
import subd.repository.WorkerRepository;
import subd.service.serviceInterfaces.WorkerService;

import java.util.List;
import java.util.Optional;
@Service
public class WorkerImplementation implements WorkerService {
    @Autowired
    private WorkerRepository workerRepository;
    @Override
    public Worker addWorker(Worker worker) {

        Worker savedWorker = workerRepository.saveAndFlush(worker);
        return savedWorker;
    }

    @Override
    public void delete(int id) {
        workerRepository.deleteById(id);
    }

    @Override
    public Optional<Worker> getById(int id) {

        return workerRepository.findById(id);
    }

    @Override
    public Worker editWorker(Worker worker) {

        return workerRepository.saveAndFlush(worker);
    }

    @Override
    public List<Worker> getAll() {

        return workerRepository.findAll();
    }
    @Override
    public List<Worker> getAll(int offset, int count) {

        return workerRepository.findAll(new OffsetablePageRequest(offset,count)).toList();
    }
}
