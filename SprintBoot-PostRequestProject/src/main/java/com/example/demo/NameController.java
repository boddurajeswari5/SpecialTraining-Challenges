package  com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import com.example.demo.service.NameService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/names")
public class NameController {

private final NameService nameService;

    @Autowired
public NameController(NameService nameService) {
  this.nameService = nameService;
    }

    @GetMapping
public List<String> getNames() {
return nameService.getNames();
    }

    @PostMapping
public void addName(@RequestBody String name) {
nameService.addName(name);
    }

}
