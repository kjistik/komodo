package kjistik.komodo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kjistik.komodo.Models.Transference;

@Repository
public interface TransferenceRepository extends JpaRepository<Transference, Long> {

}
