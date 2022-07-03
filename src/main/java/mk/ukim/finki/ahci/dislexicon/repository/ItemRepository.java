package mk.ukim.finki.ahci.dislexicon.repository;

import mk.ukim.finki.ahci.dislexicon.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
