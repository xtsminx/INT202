package sit.int202.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sit.int202.demo.entities.Office;
import sit.int202.demo.repositories.OfficeRepository;

import java.util.List;

@Controller
@RequestMapping("/offices")
public class OfficeController {
    @Autowired
    private OfficeRepository repository;

    @GetMapping("/all")
    public String getAllOffices(ModelMap modelMap) {
        List<Office> offices = repository.findAll();
        modelMap.addAttribute("offices",offices);
        return "office_list";
    }

    @GetMapping("/json-all")
    public ResponseEntity<List<Office>> getAllOfficesJsson() {
        return ResponseEntity.ok(repository.findAll());
    }
}
