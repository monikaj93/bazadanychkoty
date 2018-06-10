package pl.kobietydokodu.bazakotow.model;

import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="koty")
public class Kot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long kotId;

    String imie;
    Date dataUrodzenia = new Date();
    float waga;
    String imieOpiekuna;

    @OneToMany(mappedBy="kot")
    private List<Zabawka> zabawki = new ArrayList<>();

    public Long getKotId() {
        return kotId;
    }

    public void setKotId(Long kotId) {
        this.kotId = kotId;
    }

    public Long getMyId() {
        return kotId;
    }

    public void setMyId(Long myId) {
        this.kotId = myId;
    }

    public List<Zabawka> getZabawki() {
        return zabawki;
    }

    public void setZabawki(List<Zabawka> zabawki) {
        this.zabawki = zabawki;
    }

    public void addZabawka(Zabawka zabawka){
        zabawki.add(zabawka);
        zabawka.setKot(this);
    }

    public String getImie() {
        return imie;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public float getWaga() {
        return waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public String przedstawSie() {
        return "Imie: " + imie +
                "\nData urodzenia: " + dataUrodzenia +
                "\nWaga: " + waga +
                "\nImie opiekuna: " + imieOpiekuna;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setWaga(float waga) {
        this.waga = waga;
    }
}
