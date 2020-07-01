package subd;


import subd.entity.*;
import subd.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import subd.service.serviceInterfaces.*;

import java.sql.Timestamp;
import java.util.List;


@SpringBootApplication
public class Application {
    private AutoRepairRepository autoRepairRepository;
    private CarsRepository carsRepository;
    private ClientsRepository clientsRepository;
    private ComponentsInStockRepository componentsInStockRepository;
    private RouteRepository routeRepository;
    private VehicleInspectionRepository vehicleInspectionRepository;
    private WorkerRepository workerRepository;
    private AutoRepairService autoRepairService;
    private CarsService carsService;
    private ClientsService clientsService;
    private ComponentsInStockService componentsInStockService;
    private RouteService routeService;
    private VehicleInspectionService vehicleInspectionService;
    private WorkerService workerService;
@Autowired
    public Application(AutoRepairRepository autoRepairRepository,
                       CarsRepository carsRepository,
                       ClientsRepository clientsRepository,
                       ComponentsInStockRepository componentsInStockRepository,
                       RouteRepository routeRepository,
                       VehicleInspectionRepository vehicleInspectionRepository,
                       WorkerRepository workerRepository,
                       AutoRepairService autoRepairService,
                       CarsService carsService,
                       ClientsService clientsService,
                       ComponentsInStockService componentsInStockService,
                       RouteService routeService,
                       VehicleInspectionService vehicleInspectionService,
                       WorkerService workerService) {
        this.autoRepairRepository = autoRepairRepository;
        this.carsRepository = carsRepository;
        this.clientsRepository = clientsRepository;
        this.componentsInStockRepository = componentsInStockRepository;
        this.routeRepository = routeRepository;
        this.vehicleInspectionRepository = vehicleInspectionRepository;
        this.workerRepository = workerRepository;
        this.autoRepairService = autoRepairService;
        this.carsService = carsService;
        this.clientsService = clientsService;
        this.componentsInStockService = componentsInStockService;
        this.routeService = routeService;
        this.vehicleInspectionService = vehicleInspectionService;
        this.workerService = workerService;
    }
    public static void main(String[] args){

        SpringApplication.run(Application.class,args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void onStart() {

    this.getworkersalaryasc();
        this.getCarsCount();
        this.getOrdersToComplete();
    }
    private void readAutoRepair() {
        for (AutoRepair autoRepair : autoRepairService.getAll(0,7)) {
            System.out.println(autoRepair);
        }
    }
    private void readCars() {
        for (Cars cars : carsService.getAll(0,7)) {
            System.out.println(Cars);
        }
    }
    private void readClients() {
        for (Clients clients : clientsService.getAll(0, 7)) {
            System.out.println(Clients);
        }
    }
    private void readComponentsInStock() {
        for (ComponentsInStock componentsInStock : componentsInStockService.getAll(0, 7)) {
            System.out.println(componentsInStock);
        }
    }
    private void readRoute() {
        for (Route route : routeService.getAll(0, 7)) {
            System.out.println(route);
        }
    }
    private void readVehicleInspection() {
        for (VehicleInspection vehicleInspection : vehicleInspectionService.getAll(0, 7)) {
            System.out.println(vehicleInspection);
        }
    }
    private void readWorker() {
        for (Worker worker : workerService.getAll(0, 7)) {
            System.out.println(worker);
        }
    }

    Worker st = new Worker(null,"Viktor","Viktorov",10,"Driver",15000,null);
        workerService.addWorker(st);

    public void getworkersalaryasc() {
        Timestamp start = new Timestamp(System.currentTimeMillis());
        List <WorkerSalaryAsc> resultfirst = workerRepository.getworkerSalaryAsc();
        Timestamp end = new Timestamp(System.currentTimeMillis());
        System.out.println("Request time: " + (end.getTime() - start.getTime()) + " ms");
        resultfirst.forEach(WorkerSalaryAsc -> {
            System.out.print("Name: " + WorkerSalaryAsc.getName()+" ");
            System.out.print("Second Name: " + WorkerSalaryAsc.getSecondName()+" ");
            System.out.print("Salary: " + WorkerSalaryAsc.getSalary()+" ");
        });
    }
    public void getCarsCount() {
        Timestamp start = new Timestamp(System.currentTimeMillis());
        List <CarsCount> resultsecond = carsRepository.getCarsCount();
        Timestamp end = new Timestamp(System.currentTimeMillis());
        System.out.println("Request time: " + (end.getTime() - start.getTime()) + " ms");
        resultsecond.forEach(carsCount -> {
            System.out.print("Brand: " + carsCount.getBrand()+" ");
            System.out.print("Model: " + carsCount.getModel()+" ");
            System.out.print("Engine: " + carsCount.getEngine()+" ");
            System.out.print("Power: " + carsCount.getPower()+" ");
            System.out.println("Count: " + carsCount.getCount()+" ");
        });
    }
    public void getOrdersToComplete() {
        Timestamp start = new Timestamp(System.currentTimeMillis());
        List <OrdersToComplete> resulthird = routeRepository.getOrders();
        Timestamp end = new Timestamp(System.currentTimeMillis());
        System.out.println("Request time: " + (end.getTime() - start.getTime()) + " ms");
        resulthird.forEach(ordersToComplete -> {
            System.out.print("ID: " + ordersToComplete.getId()+" ");
            System.out.print("Target: " + ordersToComplete.getTarget()+" ");
            System.out.print("DateToComplete: " + ordersToComplete.getDateToComplete()+" ");
            System.out.print("Name: " + ordersToComplete.getName()+" ");
            System.out.println("Second name: " + ordersToComplete.getSecondName()+" ");
        });
    }
}
