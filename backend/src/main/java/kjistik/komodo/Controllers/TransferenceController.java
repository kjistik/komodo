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

import kjistik.komodo.Models.Transference;
import kjistik.komodo.Services.Transference.TransferenceServiceImp;

@RestController
@RequestMapping("/api/transferencias")
@CrossOrigin(origins = "http://localhost:4200")
public class TransferenceController {

    @Autowired
    TransferenceServiceImp service;

    @GetMapping("/todos")
    List<Transference> all() {
        return service.all();
    }

    @GetMapping("/one/{id}")
    Optional<Transference> one(@PathVariable Long id) {
        return service.one(id);
    }

    @PostMapping("/nuevo")
    Transference newTransference(@RequestBody Transference newTransference) {
        return service.newTransference(newTransference);
    }
}
