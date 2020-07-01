package subd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import subd.entity.Clients;

@Repository
public interface ClientsRepository  extends JpaRepository<Clients, Integer> {
}
