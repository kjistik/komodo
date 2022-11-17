package kjistik.komodo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kjistik.komodo.Models.Unit;
import kjistik.komodo.Services.Unit.UnitServiceImpl;

@RestController
@RequestMapping("/api/unidades")
@CrossOrigin(origins = "http://localhost:4200")
public class UnitController {

    @Autowired
    UnitServiceImpl service;

    @GetMapping("/todos")
    List<Unit> all() {
        return service.all();
    }

    @GetMapping("/one/{id}")
    Unit one(@PathVariable Long id) {
        return service.one(id);
    }

    @PostMapping("/nuevo")
    Unit newUnit(@RequestBody Unit newUnit) {
        return service.newUnit(newUnit);
    }

    @PutMapping("/cambiar/{id}")
    Unit change(@PathVariable Long id, @RequestBody Unit newUnit) {
        return service.change(id, newUnit);
    }
}
