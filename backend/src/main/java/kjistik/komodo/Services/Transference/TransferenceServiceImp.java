package kjistik.komodo.Services.Transference;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kjistik.komodo.Models.Transference;
import kjistik.komodo.Repositories.TransferenceRepository;

@Service
public class TransferenceServiceImp implements TransferenceService {

    @Autowired
    TransferenceRepository repo;

    @Override
    public List<Transference> all() {
        return repo.findAll();
    }

    @Override
    public Optional<Transference> one(Long id) {
        return repo.findById(id);
    }

    @Override
    public Transference newTransference(Transference newTransference) {
        return repo.save(newTransference);
    }

}
