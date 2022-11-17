package kjistik.komodo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kjistik.komodo.Models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
