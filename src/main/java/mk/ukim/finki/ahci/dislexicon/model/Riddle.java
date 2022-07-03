package mk.ukim.finki.ahci.dislexicon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Riddle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String riddleTitle;
    private String riddleAnswer;

    public Riddle (String title, String answer) {
        this.riddleTitle = title;
        this.riddleAnswer = answer;
    }
}
