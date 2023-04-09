package kjistik.komodoback.Services.Movements;

import java.util.List;
import java.util.Optional;

import kjistik.komodoback.Models.Movement;

public interface MovementService {

    List<Movement> all();

    List<Movement> ordered(Long id);

    Optional<Movement> one(Long id);

    Movement change(Long id, Movement newMovement);

    Movement newMovement(Movement newMovement);
}