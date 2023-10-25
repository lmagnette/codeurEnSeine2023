package be.lomagnette.dinosaur;

import org.springframework.data.annotation.Id;

public record Dinosaur(@Id Long id, String name, String description, String funFact) {
}
