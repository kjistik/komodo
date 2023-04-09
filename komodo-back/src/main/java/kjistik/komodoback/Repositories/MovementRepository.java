package kjistik.komodoback.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import kjistik.komodoback.Models.Movement;

public interface MovementRepository extends JpaRepository<Movement, Long> {

}
