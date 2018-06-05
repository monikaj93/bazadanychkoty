package pl.kobietydokodu.bazakotow.model;

import javax.persistence.*;

@Entity
@Table(name="zabawki")
public class Zabawka {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String nazwa;

    @ManyToOne
    @JoinColumn(name = "koty_id")
    private Kot kot;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
