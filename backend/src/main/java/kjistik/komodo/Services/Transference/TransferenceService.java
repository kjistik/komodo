package kjistik.komodo.Services.Transference;

import java.util.List;
import java.util.Optional;

import kjistik.komodo.Models.Transference;

public interface TransferenceService {

    List<Transference> all();

    Optional<Transference> one(Long id);

    Transference newTransference(Transference newTransference);
}