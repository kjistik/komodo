package kjistik.komodo.Services.Unit;

import java.util.List;

import kjistik.komodo.Models.Unit;

public interface UnitService {

    List<Unit> all();

    Unit one(Long id);

    Unit change(Long id, Unit newUnit);

    Unit newUnit(Unit newUnit);
}