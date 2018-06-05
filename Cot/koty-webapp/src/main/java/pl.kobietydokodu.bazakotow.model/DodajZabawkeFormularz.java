package pl.kobietydokodu.bazakotow.model;

import javax.validation.constraints.NotEmpty;

public class DodajZabawkeFormularz {

    @NotEmpty
    private String nazwaZabawki;

    public String getNazwaZabawki() {
        return nazwaZabawki;
    }

    public void setNazwaZabawki(String nazwaZabawki) {
        this.nazwaZabawki = nazwaZabawki;
    }
}
