package mk.ukim.finki.ahci.dislexicon.config;

import lombok.Getter;
import mk.ukim.finki.ahci.dislexicon.model.*;
import mk.ukim.finki.ahci.dislexicon.repository.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Getter
public class DataInitializer {
    private final RiddleRepository riddleRepository;
    private final ItemRepository itemRepository;
    private final QuestionRepository questionRepository;
    private final MathQuestionRepository mathQuestionRepository;
    private final ResponseRepository responseRepository;

    public DataInitializer(RiddleRepository riddleRepository, ItemRepository itemRepository,
                           QuestionRepository questionRepository, MathQuestionRepository mathQuestionRepository, ResponseRepository responseRepository) {
        this.riddleRepository = riddleRepository;
        this.itemRepository = itemRepository;
        this.questionRepository = questionRepository;
        this.mathQuestionRepository = mathQuestionRepository;
        this.responseRepository = responseRepository;
    }

    @PostConstruct
    public void init() {
        Riddle riddle1 = new Riddle("Висока сум кога сум млада, ниска сум кога сум стара. Што сум јас?", "свеќа");
        Riddle riddle2 = new Riddle("Што патува низ светот, а не се движи?", "поштенска марка");
        Riddle riddle3 = new Riddle("Што е тоа полно со дупки, а сепак собира вода?", "сунѓер");
        Riddle riddle4 = new Riddle("Кој изум ви овозможува да гледате низ ѕид?", "прозорец");
        this.riddleRepository.save(riddle1);
        this.riddleRepository.save(riddle2);
        this.riddleRepository.save(riddle3);
        this.riddleRepository.save(riddle4);


        Item item1 = new Item("книга", "img/pictureWord/книга.png", "audio/pictureWord/книга.m4a");
        Item item2 = new Item("биро", "img/pictureWord/биро.jpg", "audio/pictureWord/биро.m4a");
        Item item3 = new Item("маса", "img/pictureWord/маса.png", "audio/pictureWord/маса.m4a");
        Item item4 = new Item("молив", "img/pictureWord/молив.png", "audio/pictureWord/молив.m4a");
        Item item5 = new Item("пенкало", "img/pictureWord/пенкало.png", "audio/pictureWord/пенкало.m4a");
        Item item6 = new Item("ранец", "img/pictureWord/ранец.png", "audio/pictureWord/ранец.m4a");
        Item item7 = new Item("столче", "img/pictureWord/столче.png", "audio/pictureWord/столче.m4a");
        Item item8 = new Item("чаша", "img/pictureWord/чаша.png", "audio/pictureWord/чаша.m4a");
        this.itemRepository.save(item1);
        this.itemRepository.save(item2);
        this.itemRepository.save(item3);
        this.itemRepository.save(item4);
        this.itemRepository.save(item5);
        this.itemRepository.save(item6);
        this.itemRepository.save(item7);
        this.itemRepository.save(item8);


        Response response1 = new Response("храна", "audio/q1_hrana.m4a");
        Response response2 = new Response("вода", "audio/q2_voda.m4a");
        Response response3 = new Response("засолниште", "audio/q3_zasolniste.m4a");
        this.responseRepository.save(response1);
        this.responseRepository.save(response2);
        this.responseRepository.save(response3);
        List<Response> responseList = new ArrayList<>(Arrays.asList(response1, response2, response3));
        Question question1 = new Question("Што бараше лисицата?", "Еден ден лисицата беше гладна и насекаде " +
                "бараше храна. Таа дојде до едно лозје и здогледа грозје како виси од лозата.\n" +
                "Се обиде да го достигне но не успеа бидејќи беше многу високо. Најпосле таа рече:\n" +
                "„Грозјето е горчливо, не ми се допаѓа“, и си замина.", "audio/question1.m4a",
                responseList, response1);
        this.questionRepository.save(question1);

        Response response4 = new Response("Марија", "audio/marija.m4a");
        Response response5 = new Response("Ана", "audio/ana.m4a");
        Response response6 = new Response("Јана", "audio/jana.m4a");
        this.responseRepository.save(response4);
        this.responseRepository.save(response5);
        this.responseRepository.save(response6);
        responseList = new ArrayList<>(Arrays.asList(response4, response5, response6));
        Question question2 = new Question("Како се вика другарката на авторот?", "Децата од моето маало се многу " +
                "дружељубиви. Вчера отидовме на излет правевме скара. Јас бев главен готвач, но ми помагаше и мојата " +
                "другарка Јана. Цела ден останавме таму а кога почна да се стемнува си заминавме дома.",
                "audio/question2.m4a", responseList, response6);
        this.questionRepository.save(question2);

        Response response7 = new Response("1");
        Response response8 = new Response("4");
        Response response9 = new Response("2");
        Response response10 = new Response("9");
        this.responseRepository.save(response7);
        this.responseRepository.save(response8);
        this.responseRepository.save(response9);
        this.responseRepository.save(response10);
        responseList = new ArrayList<>(Arrays.asList(response7, response8, response9, response10));
        MathQuestion mathQuestion1 = new MathQuestion("5 + 4 = ?", responseList, response10);

        Response response11 = new Response("16");
        Response response12 = new Response("3");
        Response response13 = new Response("5");
        Response response14 = new Response("13");
        this.responseRepository.save(response11);
        this.responseRepository.save(response12);
        this.responseRepository.save(response13);
        this.responseRepository.save(response14);
        responseList = new ArrayList<>(Arrays.asList(response11, response12, response13, response14));
        MathQuestion mathQuestion2 = new MathQuestion("9 + 7 = ?", responseList, response11);

        Response response15 = new Response("18");
        Response response16 = new Response("2");
        Response response17 = new Response("7");
        Response response18 = new Response("6");
        this.responseRepository.save(response15);
        this.responseRepository.save(response16);
        this.responseRepository.save(response17);
        this.responseRepository.save(response18);
        responseList = new ArrayList<>(Arrays.asList(response15, response16, response17, response18));
        MathQuestion mathQuestion3 = new MathQuestion("12 + 6 = ?", responseList, response15);

        this.mathQuestionRepository.save(mathQuestion1);
        this.mathQuestionRepository.save(mathQuestion2);
        this.mathQuestionRepository.save(mathQuestion3);
    }
}
