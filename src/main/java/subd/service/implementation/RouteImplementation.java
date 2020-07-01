package subd.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import subd.entity.ComponentsInStock;
import subd.entity.Route;
import subd.models.OffsetablePageRequest;
import subd.repository.RouteRepository;
import subd.service.serviceInterfaces.RouteService;

import java.util.List;
import java.util.Optional;
@Service
public class RouteImplementation implements RouteService {
    @Autowired
    private RouteRepository routeRepository;
    @Override
    public Route addRoute(Route route) {

        Route savedRoute = routeRepository.saveAndFlush(route);
        return savedRoute;
    }

    @Override
    public void delete(int id) {
        routeRepository.deleteById(id);
    }

    @Override
    public Optional<Route> getById(int id) {

        return routeRepository.findById(id);
    }

    @Override
    public Route editRoute(Route route) {

        return routeRepository.saveAndFlush(route);
    }

    @Override
    public List<Route> getAll() {
        return routeRepository.findAll();
    }
    @Override
    public List<Route> getAll(int offset, int count) {

        return routeRepository.findAll(new OffsetablePageRequest(offset,count)).toList();
    }
}
