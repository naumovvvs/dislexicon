package mk.ukim.finki.ahci.dislexicon.web.rest;

import mk.ukim.finki.ahci.dislexicon.model.Item;
import mk.ukim.finki.ahci.dislexicon.model.MathQuestion;
import mk.ukim.finki.ahci.dislexicon.model.Question;
import mk.ukim.finki.ahci.dislexicon.model.Riddle;
import mk.ukim.finki.ahci.dislexicon.repository.ItemRepository;
import mk.ukim.finki.ahci.dislexicon.repository.MathQuestionRepository;
import mk.ukim.finki.ahci.dislexicon.repository.QuestionRepository;
import mk.ukim.finki.ahci.dislexicon.repository.RiddleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    private final ItemRepository itemRepository;
    private final QuestionRepository questionRepository;
    private final RiddleRepository riddleRepository;
    private final MathQuestionRepository mathQuestionRepository;

    public RestController(ItemRepository itemRepository, QuestionRepository questionRepository, RiddleRepository riddleRepository, MathQuestionRepository mathQuestionRepository) {
        this.itemRepository = itemRepository;
        this.questionRepository = questionRepository;
        this.riddleRepository = riddleRepository;
        this.mathQuestionRepository = mathQuestionRepository;
    }

    @GetMapping("/pictureWord")
    public List<Item> getAllImages() {
        return this.itemRepository.findAll();
    }

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return this.questionRepository.findAll();
    }

    @GetMapping("/riddles")
    public List<Riddle> getAllRiddles() {
        return this.riddleRepository.findAll();
    }

    @GetMapping("/math")
    public List<MathQuestion> getAllMathQuestions() {
        return this.mathQuestionRepository.findAll();
    }
}
