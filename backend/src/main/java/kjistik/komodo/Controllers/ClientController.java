package kjistik.komodo.Controllers;

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

import kjistik.komodo.Models.Client;
import kjistik.komodo.Services.Client.ClientServiceImp;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/clientes")
public class ClientController {

    @Autowired
    ClientServiceImp service;

    @GetMapping("/todos")
    List<Client> all() {
        return service.getAll();
    }

    @GetMapping("/uno/{id}")
    Optional<Client> one(@PathVariable Long id) {
        return service.one(id);
    }

    @PostMapping("/nuevo")
    Client newClient(@RequestBody Client newClient) {
        return service.newClient(newClient);
    }

    @PutMapping("/cambiar/{id}")
    Client changeClient(@PathVariable Long id, @RequestBody Client newClient) {
        return service.changeClient(id, newClient);
    }
}