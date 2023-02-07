package kjistik.komodoback.Services.Products;

import java.util.List;
import java.util.Optional;

import kjistik.komodoback.Models.Products;

public interface ProductService {

    List<Products> all();

    Optional<Products> one(Long id);

    Products newProduct(Products newProduct);

    Products change(Long id, Products newProduct);
}