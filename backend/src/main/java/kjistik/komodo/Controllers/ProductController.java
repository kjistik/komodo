package kjistik.komodo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kjistik.komodo.Models.Product;
import kjistik.komodo.Services.Producto.ProductServiceImpl;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins="http://localhost:4200")
public class ProductController {

    @Autowired
    ProductServiceImpl service;

    @GetMapping("/todos")
    List<Product> all() {
        return service.all();
    }

    @GetMapping("/uno/{id}")
    Optional<Product> one(@PathVariable Long id) {
        return service.one(id);
    }

    @PostMapping("/nuevo")
    Product newProduct(@RequestBody Product newProduct) {
        return service.newProduct(newProduct);
    }

    @PutMapping("/cambiar/{id}")
    Product change(@PathVariable Long id, @RequestBody Product newProduct) {
        return service.change(id, newProduct);
    }
}
