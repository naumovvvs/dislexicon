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
public class MathQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mathQuestionTitle;
    @ManyToMany
    private List<Response> responses;
    @OneToOne
    private Response correctAnswer;

    public MathQuestion(String mathQuestionTitle, List<Response> responses, Response correctAnswer) {
        this.mathQuestionTitle = mathQuestionTitle;
        this.responses = responses;
        this.correctAnswer = correctAnswer;
    }
}
