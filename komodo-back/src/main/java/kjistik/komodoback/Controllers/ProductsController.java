package kjistik.komodoback.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kjistik.komodoback.Models.Products;
import kjistik.komodoback.Services.Products.ProductServiceImp;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin("http://localhost:8081")
public class ProductsController {

    @Autowired
    ProductServiceImp service;

    @GetMapping("/todos")
    List<Products> all() {
        return service.all();
    }

    @GetMapping("/producto/{id}")
    Optional<Products> one(@PathVariable Long id) {
        return service.one(id);
    }

    @PostMapping("/nuevo")
    Products newProduct(@RequestBody Products newProduct) {
        return service.newProduct(newProduct);
    }

    @PutMapping("/cambiar/{id}")
    Products change(@PathVariable Long id, @RequestBody Products newProduct){
        return service.change(id, newProduct);
    }
}