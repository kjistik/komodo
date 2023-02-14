package kjistik.komodoback.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kjistik.komodoback.Models.Units;
import kjistik.komodoback.Services.Units.UnitsServiceImp;

@RestController
@RequestMapping("/api/unidades")
@CrossOrigin("http://localhost:8081")
public class UnitsController {

@Autowired
UnitsServiceImp service;

    @GetMapping("/todos")
    List<Units> all(){
        return service.all();
    }
}
