package kjistik.komodoback.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import kjistik.komodoback.Models.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
