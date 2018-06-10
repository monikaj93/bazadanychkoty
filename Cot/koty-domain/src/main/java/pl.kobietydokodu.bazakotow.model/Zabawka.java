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
    //Long koteczek;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="kotid", referencedColumnName = "kotid")
    private Kot kot;


    public Long getZid() {
        return zid;
    }

    public void setZid(Long zid) {
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
