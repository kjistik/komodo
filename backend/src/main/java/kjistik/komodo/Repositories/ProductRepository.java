package kjistik.komodo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kjistik.komodo.Models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
