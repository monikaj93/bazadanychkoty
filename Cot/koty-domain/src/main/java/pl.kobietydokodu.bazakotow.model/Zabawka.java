package pl.kobietydokodu.bazakotow.model;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Table(name="zabawki")
public class Zabawka {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long zid;

    String nazwa;

    @ManyToOne
    @JoinColumn(name = "koty_id")
    private Kot kot;


    public Long getId() {
        return zid;
    }

    public void setId(Long id) {
        this.zid = zid;
    }

    public Kot getKot() {
        return kot;
    }

    public void setKot(Kot kot) {
        this.kot = kot;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
