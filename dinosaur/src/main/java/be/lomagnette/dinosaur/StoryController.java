package be.lomagnette.dinosaur;

import org.springframework.ai.client.AiClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@ResponseBody
@CrossOrigin(origins = "*")
public class StoryController {

    private final AiClient aiClient;

    public StoryController(AiClient aiClient) {
        this.aiClient = aiClient;
    }

    @PostMapping("/story")
    public String story(@RequestBody List<String> context) {
        String prompt = "Raconte moi une courte histoire pour un enfant de 2 ans sur base du contexte suivant: \n"
                + context.stream().collect(Collectors.joining("."));
        return aiClient.generate(prompt);
    }
}
