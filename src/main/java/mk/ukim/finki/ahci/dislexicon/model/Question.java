package mk.ukim.finki.ahci.dislexicon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionTitle;
    private String textQuestion;
    private String audioPath;
    @ManyToMany
    private List<Response> responses;
    @OneToOne
    private Response correctAnswer;

    public Question(String title, String text, String audioPath, List<Response> responses, Response correctResponse) {
        this.questionTitle = title;
        this.textQuestion = text;
        this.audioPath = audioPath;
        this.responses = responses;
        this.correctAnswer = correctResponse;
    }
}
