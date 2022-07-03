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
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String responseText;
    private String audioPath;

    public Response(String responseText) {
        this.responseText = responseText;
    }

    public Response(String responseText, String audioPath) {
        this.responseText = responseText;
        this.audioPath = audioPath;
    }
}
