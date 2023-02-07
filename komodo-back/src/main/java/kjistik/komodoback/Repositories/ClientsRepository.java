package kjistik.komodoback.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import kjistik.komodoback.Models.Clients;

public interface ClientsRepository extends JpaRepository<Clients, Long>{
    
}
