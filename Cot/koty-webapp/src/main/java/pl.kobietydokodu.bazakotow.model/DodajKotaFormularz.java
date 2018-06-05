package pl.kobietydokodu.bazakotow.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import java.util.Date;

public class DodajKotaFormularz {

    @NotEmpty
    private String imieKota;

    @DateTimeFormat(pattern = "MM-dd-yyy")
    @Past
    private Date dataUrodzenia;

    @Min(0)
    private float waga;

    @NotEmpty
    private String imieOpiekuna;

    public String getImieKota() {
        return imieKota;
    }

    public void setImieKota(String imieKota) {
        this.imieKota = imieKota;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public float getWaga() {
        return waga;
    }

    public void setWaga(float waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }
}
