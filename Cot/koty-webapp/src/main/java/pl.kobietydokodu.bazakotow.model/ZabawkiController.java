package pl.kobietydokodu.bazakotow.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class ZabawkiController {

    private final ZabawkaDAO zabawkadao;

    @Autowired
    public ZabawkiController(ZabawkaDAO zabawkadao){this.zabawkadao=zabawkadao;}

    @RequestMapping(value = "/dodajZabawke", method = RequestMethod.GET)
    public String dodajZabawke(Model model) {
        model.addAttribute("dodajZabawkeFormularz", new DodajZabawkeFormularz());
        return "dodajZabawke";
    }

    @RequestMapping(value = "/dodajZabawke", method = RequestMethod.POST)
    public String obsluzdodajZabawke(@ModelAttribute("dodajZabawkeFormularz") @Valid DodajZabawkeFormularz dodajZabawkeFormularz, BindingResult result) {
        if (result.hasErrors()) {
            //formularz z błędami, użytkownik zostaje na stronie formularza
            return "dodajZabawke";
        } else {
            Zabawka zabawka = new Zabawka();
            zabawka.setNazwa(dodajZabawkeFormularz.getNazwaZabawki());

            zabawkadao.save(zabawka);

            return "redirect:/szczegoly";
        }
    }

    //dodawanie zabawki

    //usuwanie zabawki
}
