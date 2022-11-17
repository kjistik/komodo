package kjistik.komodo.Services.Movement;

import java.util.List;
import java.util.Optional;

import kjistik.komodo.Models.Movement;

public interface MovementService {

    List<Movement> all();

    Optional<Movement> one(Long id);

    Movement newMovement(Movement newMovement);
}