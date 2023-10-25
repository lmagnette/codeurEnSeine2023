package be.lomagnette;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Paw extends PanacheEntity {

    public String name;
    public String description;
    @Column(name = "fun_fact")
    public String funFact;
}
