package pl.kobietydokodu.bazakotow.model;

import org.springframework.beans.NotWritablePropertyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ZabawkiController {

    private final ZabawkaDAO zabawkadao;
    private final KotDao kotdao;

    @Autowired
    public ZabawkiController(ZabawkaDAO zabawkadao, KotDao kotdao){
        this.zabawkadao=zabawkadao;
        this.kotdao = kotdao;
    }

    @RequestMapping(value = "/dodajZabawke-{id}", method = RequestMethod.GET)
    public String dodajZabawke(Model model) {
        model.addAttribute("dodajZabawkeFormularz", new DodajZabawkeFormularz());
        return "dodajZabawke";
    }

    @RequestMapping(value = "/dodajZabawke-{id}", method = RequestMethod.POST)
    @Transactional
    public String obsluzdodajZabawke(@PathVariable("id") Long id, @ModelAttribute("dodajZabawkeFormularz") @Valid DodajZabawkeFormularz dodajZabawkeFormularz, BindingResult result) {
        if (result.hasErrors()) {
            //formularz z błędami, użytkownik zostaje na stronie formularza
            return "/dodajZabawke-{id}";
        } else {
            Kot kot = kotdao.findById(id).get();
            Zabawka zabawka = new Zabawka();
            zabawka.setNazwa(dodajZabawkeFormularz.getNazwaZabawki());
            kot.addZabawka(zabawka);
            kotdao.save(kot);
            zabawkadao.save(zabawka);
            return "redirect:/lista";
        }
    }

}
