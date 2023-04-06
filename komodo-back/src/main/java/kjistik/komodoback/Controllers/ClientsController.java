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
import kjistik.komodoback.Models.Clients;
import kjistik.komodoback.Services.Clients.ClientServiceImp;

@RestController
@CrossOrigin("http://localhost:8081")
@RequestMapping("/api/clientes")
public class ClientsController {

    @Autowired
    ClientServiceImp service;

    @GetMapping("/todos")
    List<Clients> all() {
        return service.all();
    }

    @GetMapping("/cliente/{id}")
    Optional<Clients> one(@PathVariable Long id) {
        return service.one(id);
    }

    @PostMapping("/nuevo")
    Clients newclient(@RequestBody Clients newClient) {
        return service.newClient(newClient);
    }

    @PutMapping("/cambiar/{id}")
    Clients changeClient(@PathVariable Long id, @RequestBody Clients newClient) {
        return service.changeClient(id, newClient);
    }
}