package kjistik.komodo.Services.Producto;

import java.util.List;
import java.util.Optional;

import kjistik.komodo.Models.Product;

public interface ProductService {

    List<Product> all();

    Optional<Product> one(Long id);

    Product change(Long id, Product newProduct);

    Product newProduct(Product newProduct);
}