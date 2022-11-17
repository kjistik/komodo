package kjistik.komodo.Services.Unit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kjistik.komodo.Models.Unit;
import kjistik.komodo.Repositories.UnitRepository;

@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    UnitRepository repo;

    @Override
    public List<Unit> all() {
        return repo.findAll();
    }

    @Override
    public Unit one(Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public Unit change(Long id, Unit newUnit) {
        return repo.findById(id)
                .map(unit -> {
                    unit.setActive(newUnit.isActive());
                    unit.setNombre_unidad(newUnit.getNombre_unidad());
                    return repo.save(unit);
                })
                .orElseGet(() -> {
                    newUnit.setIdUnidad(id);
                    return repo.save(newUnit);
                });
    }

    @Override
    public Unit newUnit(Unit newUnit) {
        return repo.save(newUnit);
    }

}
