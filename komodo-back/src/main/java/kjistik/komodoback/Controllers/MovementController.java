package kjistik.komodoback.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kjistik.komodoback.Models.Movement;
import kjistik.komodoback.Services.Movements.MovementServiceImpl;

@RestController
@RequestMapping("/api/movimientos")
public class MovementController {

    @Autowired
    MovementServiceImpl service;

    @GetMapping("/todos")
    List<Movement> all() {
        return service.all();
    }

    @GetMapping("/ordenados/{id}")
    List<Movement> ordered(@PathVariable Long id) {
        return service.ordered(id);
    }

    @GetMapping("/movimiento/{id}")
    Optional<Movement> one(@PathVariable Long id) {
        return service.one(id);
    }

    @PutMapping("/cambiar/{id}")
    Movement change(@PathVariable Long id, @RequestBody Movement newmMovement) {
        return service.change(id, newmMovement);
    }

    @PostMapping("/nuevo")
    Movement newMovement(@RequestBody Movement newMovement) {
        return service.newMovement(newMovement);
    }
}