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

import kjistik.komodoback.Models.OrderBacklog;
import kjistik.komodoback.Services.Order_backlogs.Order_backlogServiceImpl;

@RestController
@RequestMapping("/api/ordenes")
public class Order_backlogController {

    @Autowired
    Order_backlogServiceImpl service;

    @GetMapping("/todos")
    List<OrderBacklog> all() {
        return service.all();
    }

    @GetMapping("/orden/{id}")
    Optional<OrderBacklog> one(@PathVariable Long id) {
        return service.one(id);
    }

    @PutMapping("/cambiar/{id}")
    OrderBacklog change(@PathVariable Long id, @RequestBody OrderBacklog newOrder) {
        return service.changeBacklog(id, newOrder);
    }

    @PostMapping("/nuevo")
    OrderBacklog newBacklog(@RequestBody OrderBacklog newOrder) {
        return service.newBacklog(newOrder);
    }
}
