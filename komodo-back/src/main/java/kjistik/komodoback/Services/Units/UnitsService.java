package kjistik.komodoback.Services.Units;

import java.util.List;
import java.util.Optional;

import kjistik.komodoback.Models.Units;

public interface UnitsService {

    List<Units> all();

    Optional<Units> one(Long id);

    Units newUnit(Units newUnit);

    void delete(Long id);
}
