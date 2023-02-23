
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

import kjistik.komodoback.Models.Provider;
import kjistik.komodoback.Services.Providers.ProviderServiceImp;

@CrossOrigin("http://localhost:8081")
@RestController
@RequestMapping("/api/proveedores")
public class ProvidersController {

    @Autowired
    ProviderServiceImp service;

    @GetMapping("/todos")
    List<Provider> all() {
        return service.all();
    }

    @GetMapping("/proveedor/{id}")
    Optional<Provider> one(@PathVariable Long id) {
        return service.one(id);
    }

    @PostMapping("/nuevo")
    Provider newProvider(@RequestBody Provider newProvider) {
        return service.newProvider(newProvider);
    }

    @PutMapping("/cambiar/{id}")
    Provider change(@PathVariable Long id, @RequestBody Provider newProvider) {
        return service.change(id, newProvider);
    }
}