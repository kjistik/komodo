package kjistik.komodoback.Services.Products;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kjistik.komodoback.Models.Products;
import kjistik.komodoback.Repositories.ProductsRepository;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductsRepository repo;

    @Override
    public List<Products> all() {
        return repo.findAll();
    }

    @Override
    public Optional<Products> one(Long id) {
        return repo.findById(id);
    }

    @Override
    public Products newProduct(Products newProduct) {
        return repo.save(newProduct);
    }

    @Override
    public Products change(Long id, Products newProduct) {
        return repo.findById(id)
                .map(product -> {
                    product.setActive(newProduct.isActive());
                    product.setMovement_product(newProduct.getMovement_product());
                    product.setProduct_name(newProduct.getProduct_name());
                    product.setProduct_ppu(newProduct.getProduct_ppu());
                    product.setProduct_quantity(newProduct.getProduct_quantity());
                    product.setProduct_unit(newProduct.getProduct_unit());
                    return repo.save(product);
                })
                .orElseGet(() -> {
                    newProduct.setId_product(id);
                    return repo.save(newProduct);
                });
    }
}