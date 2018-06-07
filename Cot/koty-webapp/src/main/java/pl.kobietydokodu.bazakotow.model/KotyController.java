package pl.kobietydokodu.bazakotow.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class KotyController {

    private final KotDao dao;

    @Autowired
    public KotyController(KotDao dao) {
        this.dao = dao;
    }

    //przekierowanie do strony na ktorej mozna dodac nowego kota
    @RequestMapping(value = "/dodaj", method = RequestMethod.GET)
    public String dodajKota(Model model) {
        model.addAttribute("dodajKotaFormularz", new DodajKotaFormularz());
        return "dodaj";
    }

    @RequestMapping(value = "/dodaj", method = RequestMethod.POST)
    public String obsluzdodajKota(@ModelAttribute("dodajKotaFormularz") @Valid DodajKotaFormularz dodajKotaFormularz, BindingResult result) {
        if (result.hasErrors()) {
            //formularz z błędami, użytkownik zostaje na stronie formularza
            return "dodaj";
        } else {
            Kot kot = new Kot();
            kot.setImie(dodajKotaFormularz.getImieKota());
            kot.setDataUrodzenia(dodajKotaFormularz.getDataUrodzenia());
            kot.setWaga(dodajKotaFormularz.getWaga());
            kot.setImieOpiekuna(dodajKotaFormularz.getImieOpiekuna());

            dao.save(kot);

            //dao.dodajKota(kot);
            return "redirect:/lista";
        }
    }

    //przekierowanie do strony z lista kotow
    @RequestMapping("/lista")
    public String listaKotow(Model model) {
        model.addAttribute("koty", dao.findAll());
        return "lista";
    }

    //przekierowanie do strony ze szczegolami na temat danego kota
    @RequestMapping("/kot-{id}")
    public String szczegolyKota(@PathVariable("id") Long id, Model model) {
        model.addAttribute("kot", dao.findById(id).get());
        return "szczegoly";
    }

}