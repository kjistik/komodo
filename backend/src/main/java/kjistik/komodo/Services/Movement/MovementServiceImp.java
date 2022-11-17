package kjistik.komodo.Services.Movement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kjistik.komodo.Models.Movement;
import kjistik.komodo.Repositories.MovementRepository;

@Service
public class MovementServiceImp implements MovementService {

    @Autowired
    MovementRepository repo;

    @Override
    public List<Movement> all() {
        return repo.findAll();
    }

    @Override
    public Optional<Movement> one(Long id) {
        return repo.findById(id);
    }

    @Override
    public Movement newMovement(Movement newMovement) {
        return repo.save(newMovement);
    }

}
