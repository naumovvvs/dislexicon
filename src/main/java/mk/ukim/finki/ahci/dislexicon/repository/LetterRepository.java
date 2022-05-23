package mk.ukim.finki.ahci.dislexicon.repository;

import mk.ukim.finki.ahci.dislexicon.model.Letter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LetterRepository extends JpaRepository<Letter, Long> {

}
