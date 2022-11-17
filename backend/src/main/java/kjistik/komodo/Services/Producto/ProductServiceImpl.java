package kjistik.komodo.Services.Producto;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kjistik.komodo.Models.Product;
import kjistik.komodo.Repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repo;

    @Override
    public List<Product> all() {
        return repo.findAll();
    }

    @Override
    public Optional<Product> one(Long id) {
        return repo.findById(id);
    }

    @Override
    public Product change(Long id, Product newProduct) {
        return repo.findById(id)
                .map(product -> {
                    product.setNombre_producto(newProduct.getNombre_producto());
                    product.setCantidad_producto(newProduct.getCantidad_producto());
                    product.setProducto_unidad(newProduct.getProducto_unidad());
                    product.setActive(newProduct.isActive());
                    product.setPrecio_producto(newProduct.getPrecio_producto());
                    return repo.save(product);
                })
                .orElseGet(() -> {
                    newProduct.setIdProducto(id);
                    return repo.save(newProduct);
                });
    }

    @Override
    public Product newProduct(Product newProduct) {
        return repo.save(newProduct);
    }
}