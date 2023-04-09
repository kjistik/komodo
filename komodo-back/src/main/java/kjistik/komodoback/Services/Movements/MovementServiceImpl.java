package kjistik.komodoback.Services.Movements;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kjistik.komodoback.Models.Movement;
import kjistik.komodoback.Repositories.MovementRepository;

@Service
public class MovementServiceImpl implements MovementService {

    @Autowired
    MovementRepository repo;

    @Override
    public List<Movement> all() {
        return repo.findAll();
    }

    @Override
    // TODO: replace with a custom query "SELECT  FROM movement WHERE order_backlog = :order_backlog"
    public List<Movement> ordered(Long id) {
        List<Movement> list = repo.findAll();
        List<Movement> result = new ArrayList<Movement>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getOrder_backlog().getId_order() == id) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    @Override
    public Optional<Movement> one(Long id) {
        return repo.findById(id);
    }

    @Override
    public Movement change(Long id, Movement newMovement) {
        return repo.findById(id)
                .map(movement -> {
                    movement.setConfirmed(newMovement.isConfirmed());
                    movement.setCurrent_ppu(newMovement.getCurrent_ppu());
                    movement.setMovement_date(newMovement.getMovement_date());
                    movement.setMovement_product(newMovement.getMovement_product());
                    movement.setMovement_value(newMovement.getMovement_value());
                    movement.setOrder_backlog(newMovement.getOrder_backlog());
                    return repo.save(movement);
                })
                .orElseGet(() -> {
                    newMovement.setId_movement(id);
                    return repo.save(newMovement);
                });
    }

    @Override
    public Movement newMovement(Movement newMovement) {
        return repo.save(newMovement);
    }

}
