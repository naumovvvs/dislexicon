package mk.ukim.finki.ahci.dislexicon.repository;

import mk.ukim.finki.ahci.dislexicon.model.Riddle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiddleRepository extends JpaRepository<Riddle, Long> {

}
