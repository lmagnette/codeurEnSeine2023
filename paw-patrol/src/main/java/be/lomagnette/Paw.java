package be.lomagnette;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import io.smallrye.mutiny.Uni;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Random;

@Entity
public class Paw extends PanacheEntity {

    public String name;
    public String description;
    @Column(name = "fun_fact")
    public String funFact;

    public static Uni<Paw> findRandom() {
        Random random = new Random();
        Uni<Paw> chain = count()
                .map(count -> random.nextInt(count.intValue()))
                .chain(randomPaw -> Paw.findAll().page(randomPaw, 1).firstResult());
        return chain;
    }
}
