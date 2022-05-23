package mk.ukim.finki.ahci.dislexicon.repository;

import mk.ukim.finki.ahci.dislexicon.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {
}
