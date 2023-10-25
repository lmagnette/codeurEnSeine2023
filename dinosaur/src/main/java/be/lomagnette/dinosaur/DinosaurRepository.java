package be.lomagnette.dinosaur;

import org.springframework.data.repository.ListCrudRepository;

public interface DinosaurRepository extends ListCrudRepository<Dinosaur, Long> {
}
