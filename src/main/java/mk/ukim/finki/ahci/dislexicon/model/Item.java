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
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String imagePath;
    private String audioPath;

    public Item(String title, String imagePath, String audioPath) {
        this.title = title;
        this.imagePath = imagePath;
        this.audioPath = audioPath;
    }
}
