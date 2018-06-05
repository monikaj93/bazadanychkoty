package pl.kobietydokodu.bazakotow.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;


public class Main {

//    static Scanner input = new Scanner(System.in);
//
//    static KotDAO listaKotow = new KotDAO();
//
//    public static void main(String[] args) {
//        String decyzja;
//        do {
//            //Wyświetl menu
//            Menu();
//            //Użytkownik wybiera opcje z menu
//            decyzja = getUserInput();
//
//            if (decyzja.equals("1")) {
//                dodajKota();
//            } else if (decyzja.equals("2")&&!listaKotow.getKoty().isEmpty()) {
//                wyswietlListeKotow();
//            }
//        } while (!decyzja.equals("x"));
//
//    }
//    public static String getUserInput() {
//        return input.nextLine();
//    }
//
//    public static void Menu(){
//        System.out.println("Menu\n1. Dodaj kota\n2. Pokaż koty\nx.Zamknij program");
//    }
//
//    public static void dodajKota(){
//        Kot pies = new Kot();
//
//        //Nadajemy kotu imię
//        System.out.println("Dawaj imie kota: ");
//        pies.setImie(getUserInput());
//
//        //Podajemy imię właściciela
//        System.out.println("Dawaj swoje imie: ");
//        pies.setImieOpiekuna(getUserInput());
//
//        //Zapis daty urodzenia kota
//        System.out.println("Data urodzenia kota (RRRR-MM-DD): ");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date dataUrodzenia = null;
//        int a = 0;
//        do {
//            String data = getUserInput();
//            try {
//                dataUrodzenia = sdf.parse(data);
//                a = 1;
//            } catch (ParseException pe) {
//                System.out.println("Coś jest nie tak z formatem daty!");
//            }
//        } while (a == 0);
//        pies.setDataUrodzenia(dataUrodzenia);
//
//        //Zapis wagi kota
//        int b = 0;
//        float wagaKota = 0;
//        System.out.println("Waga kota: ");
//        do {
//            String waga = getUserInput();
//            try {
//                wagaKota = parseFloat(waga);
//                b = 1;
//            } catch (Exception nfe) {
//                System.out.println("Coś jest nie tak z formatem wagi!");
//            }
//        } while (b == 0);
//        pies.setWaga(wagaKota);
//
//        //Dodaj kota do listy
//        listaKotow.dodajKota(pies);
//    }
//
//    public static void wyswietlListeKotow() {
//        //wyswietla liste kotow
//        Kot kot;
//        for (int i=0; i<listaKotow.getKoty().size(); i++) {
//            kot = listaKotow.getKoty().get(i);
//            System.out.println(i+1 + ": " + kot.getImie());
//        }
//        //wybierz kota
//        Pattern wzorzecNumeru = Pattern.compile("[0-9]+");
//        String numerWczytany;
//        do {
//            System.out.print("Którego kota chcesz poznać bliżej? ");
//            numerWczytany = getUserInput();
//        } while (!wzorzecNumeru.matcher(numerWczytany).matches());
//
//        Integer numerKota = Integer.parseInt(numerWczytany);
//        //pokazuje szczegoly na temat wybranego kota
//
//        if (numerKota <= listaKotow.getKoty().size()) {
//            Kot wybranyKot = listaKotow.getKoty().get(numerKota-1);
//            System.out.println("Imie kota: " + wybranyKot.getImie() + " Waga: " + wybranyKot.getWaga() + " Data urodzenia: " + wybranyKot.getDataUrodzenia().toString() + " Opiekun: " + wybranyKot.getImieOpiekuna());
//        } else {
//            System.out.println("Nie ma takiego kota");
//        }
//    }
}
