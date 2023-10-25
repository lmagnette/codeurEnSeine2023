package be.lomagnette.dinosaur;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;

public interface DinosaurRepository extends ListCrudRepository<Dinosaur, Long> {

    @Query("SELECT * FROM dinosaur ORDER BY RANDOM() LIMIT 1")
    Dinosaur findRandom();
}
