package pl.kobietydokodu.bazakotow.model;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="koty")
public class Kot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long myId;

    String imie;
    Date dataUrodzenia = new Date();
    float waga;
    String imieOpiekuna;

    @OneToMany(mappedBy="kot")
    private List <Zabawka> zabawki;

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
