package mk.ukim.finki.ahci.dislexicon.web.rest;

import mk.ukim.finki.ahci.dislexicon.model.Item;
import mk.ukim.finki.ahci.dislexicon.model.Question;
import mk.ukim.finki.ahci.dislexicon.repository.ItemRepository;
import mk.ukim.finki.ahci.dislexicon.repository.QuestionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    private final ItemRepository itemRepository;
    private final QuestionRepository questionRepository;

    public RestController(ItemRepository itemRepository, QuestionRepository questionRepository) {
        this.itemRepository = itemRepository;
        this.questionRepository = questionRepository;
    }

    @GetMapping("/pictureWord")
    public List<Item> getAllImages() {
        return this.itemRepository.findAll();
    }

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return this.questionRepository.findAll();
    }
}
