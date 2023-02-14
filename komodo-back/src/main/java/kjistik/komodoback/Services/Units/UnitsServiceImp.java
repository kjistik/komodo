package kjistik.komodoback.Services.Units;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kjistik.komodoback.Models.Units;
import kjistik.komodoback.Repositories.UnitsRepository;

@Service
public class UnitsServiceImp implements UnitsService {

    @Autowired
    UnitsRepository repo;

    @Override
    public List<Units> all() {
        return repo.findAll();
    }

    @Override
    public Optional<Units> one(Long id) {
        return repo.findById(id);
    }

    @Override
    public Units newUnit(Units newUnit) {
        return repo.save(newUnit);

    }

}