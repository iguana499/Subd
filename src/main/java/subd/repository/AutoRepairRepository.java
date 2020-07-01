package subd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import subd.entity.AutoRepair;

@Repository
public interface AutoRepairRepository extends JpaRepository<AutoRepair, Integer> {
}
