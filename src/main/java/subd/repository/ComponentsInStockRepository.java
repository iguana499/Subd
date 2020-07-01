package subd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import subd.entity.ComponentsInStock;

@Repository
public interface ComponentsInStockRepository extends JpaRepository<ComponentsInStock, Integer> {
}
