package be.lomagnette.dinosaur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dinosaur")
@ResponseBody
@CrossOrigin(origins = "*")
public class DinosaurController {

    private final DinosaurRepository dinosaurRepository;

    public DinosaurController(DinosaurRepository dinosaurRepository) {
        this.dinosaurRepository = dinosaurRepository;
    }

    @GetMapping
    public List<Dinosaur> getDinosaurs() {
        return dinosaurRepository.findAll();
    }

}
