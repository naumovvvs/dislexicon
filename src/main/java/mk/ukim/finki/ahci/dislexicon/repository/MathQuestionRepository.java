package mk.ukim.finki.ahci.dislexicon.repository;

import mk.ukim.finki.ahci.dislexicon.model.MathQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MathQuestionRepository extends JpaRepository<MathQuestion, Long> {

}

