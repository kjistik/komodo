package kjistik.komodo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kjistik.komodo.Models.Unit;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {

}