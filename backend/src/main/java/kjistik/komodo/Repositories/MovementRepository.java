package kjistik.komodo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kjistik.komodo.Models.Movement;

@Repository
public interface MovementRepository extends JpaRepository<Movement, Long> {

}
