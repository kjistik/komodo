package kjistik.komodo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kjistik.komodo.Models.Movement;
import kjistik.komodo.Services.Movement.MovementServiceImp;

@RestController
@RequestMapping("/api/movimientos")
@CrossOrigin(origins = "http://localhost:4200")
public class MovementController {

    @Autowired
    MovementServiceImp service;

    @GetMapping("/todos")
    public List<Movement> all() {
        return service.all();
    }

    @GetMapping("/uno/{id}")
    public Optional<Movement> one(@PathVariable Long id) {
        return service.one(id);
    }

    @PostMapping("/nuevo")
    public Movement newMovement(@RequestBody Movement newMovement) {
        return service.newMovement(newMovement);
    }

}
