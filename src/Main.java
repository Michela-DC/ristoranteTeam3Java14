import Core.Menu;
import Core.Portata;
import Database.MenuDao;
import Database.PortataDao;
import PortateEntity.*;
import Enumerati.AllergeniEnum;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        Menu menu = new Menu("RISTORANTE GLI ORSI BRUNI", "Contemporary and classic italian cuisine");
        
        // List.of() lo usiamo per creare una lista di allergeni che prendiamo da Enumerati.AllergeniEnum
        //Antipasti
        Portata polentinaConcia = new Antipasto("Polentina Concia" , 6.50 , "Polenta morbida al burro e fontina con sbriciolata di prosciutto crudo essicato", 800, List.of(AllergeniEnum.LATTE), true);
        Portata tartareDiManzo = new Antipasto("Tartare di manzo" , 10.50 , "Con cremoso al pecorino, funghi pleius scottati e polvere di porcino essiccato", 700, List.of(AllergeniEnum.LATTE), false);
        Portata iNostriSpiedini = new Antipasto("I nostri spiedini" , 9.50 , "Spiedini di manzo con crema delicata all’aglio e mentuccia, spiedini di maiale , spiedini di vitello con salsa teriyaki e granella di pistacchio", 650,  List.of(), true);
        Portata bresaolaRucolaParmigiano = new Antipasto("Bresaola con rucola e parmigiano" , 8.50 , "Sottili fette di carne di manzo essiccata servite con rucola e scaglie di parmigiano", 450,  List.of(AllergeniEnum.LATTE), true);
        Portata salumiMisti = new Antipasto("Tagliere di salumi misti" , 12.50 , "Un assortimento di salumi come prosciutto, salame, coppa, bresaola e mortadella", 500, List.of(), false);

        menu.aggiungiPortata(polentinaConcia);
        menu.aggiungiPortata(tartareDiManzo);
        menu.aggiungiPortata(iNostriSpiedini);
        menu.aggiungiPortata(bresaolaRucolaParmigiano);
        menu.aggiungiPortata(salumiMisti);

        //Primi piatti
        Portata spaghettiAllaCarbonara = new PrimoPiatto("Spaghetti alla carbonara" , 10.50,"Spaghetti conditi con uova, pancetta, pecorino romano e pepe nero", 750, List.of(AllergeniEnum.GLUTINE, AllergeniEnum.UOVA), false);
        Portata risottoAiFunghiESalsiccia = new PrimoPiatto("Risotto ai funghi e salsiccia" , 12.50,"Risotto cremoso preparato con funghi porcini freschi e parmigiano reggiano",680,  List.of(AllergeniEnum.LATTE), false);
        Portata lasagneAlRagu = new PrimoPiatto("Lasagne al ragù" , 12.00,"Strati di pasta all'uovo, ragù di carne, besciamella e formaggio gratinato", 700, List.of(AllergeniEnum.GLUTINE), true) ;
        Portata penneAllArrabbiata = new PrimoPiatto("Penne all'arrabbiata" , 9.00,"Penne condite con salsa piccante al pomodoro, aglio, peperoncino e prezzemolo", 650, List.of(AllergeniEnum.GLUTINE), true);
        Portata pappardelleAlCinghiale = new PrimoPiatto("Pappardelle al cinghiale" , 9.50,"Gnocchi di patate freschi serviti con salsa al basilico, pinoli, parmigiano e olio d'oliva", 950, List.of(AllergeniEnum.GLUTINE, AllergeniEnum.LATTE, AllergeniEnum.FRUTTA_A_GUSCIO), true);

        menu.aggiungiPortata(spaghettiAllaCarbonara);
        menu.aggiungiPortata(risottoAiFunghiESalsiccia);
        menu.aggiungiPortata(lasagneAlRagu);
        menu.aggiungiPortata(penneAllArrabbiata);
        menu.aggiungiPortata(pappardelleAlCinghiale);

        //Secondi
        Portata scaloppineAlLimone = new SecondoPiatto("Scaloppine al limone", 12.00, "Fettine di vitello  battute e poi cotte in padella con succo di limone, burro e prezzemolo", 500, List.of(), "Allevamento biologico");
        Portata arrostoDiMaiale = new SecondoPiatto("Arrosto di maiale", 14.00, "Arrosto di delizioso filetto di maialino nero", 550, List.of(), "Allevamento biologico");
        Portata bisteccaAllaFiorentina = new SecondoPiatto("Bistecca alla fiorentina", 24.00, "Bistecca di carne marchigiana con taglio da fiorentina", 600, List.of(), "Allevamento locale");
        Portata abbacchioAllaRomana = new SecondoPiatto("Abbacchio alla romana", 16.00, "Carne di agnello da latte marinata con aglio, rosmarino, pepe nero e succo di limone cotta lentamente in padella", 650, List.of(), "Allevamento biologico");
        Portata polloAllaCacciatora = new SecondoPiatto("Pollo alla cacciatora", 14.00, "Pollo allevato a terra con  contorno di patate al forno", 600, List.of(), "Allevamento biologico");

        menu.aggiungiPortata(scaloppineAlLimone);
        menu.aggiungiPortata(arrostoDiMaiale);
        menu.aggiungiPortata(bisteccaAllaFiorentina);
        menu.aggiungiPortata(abbacchioAllaRomana);
        menu.aggiungiPortata(polloAllaCacciatora);

        //Contorni
        Portata patateAlForno = new Contorno("Patate al forno", 7.00, "Patate cotte al forno con olio e rosmarino", 400, List.of(), false, "Patate tagliate a spicchi.");
        Portata verdureGrigliate = new Contorno("Verdure grigliate", 7.20, "Melanzane, zucchine, peperoni, marinate in olio, sale, pepe, aglio e prezzemolo", 500, List.of(), true, "Marinatura preparata al momento.");
        Portata insalataMista = new Contorno("Insalata mista", 6.80, "Lattuga, pomodorini, carote, uova", 500, List.of(AllergeniEnum.UOVA), true, "Due uova sode tagliate a metà.");
        Portata caponata = new Contorno("Caponata", 7.50, "Melanzane, zucchine, cipolla, polpa di pomodoro, sale, olio, pepe, aceto di vino bianco, zucchero", 450, List.of(), false, "Servita fredda se richiesto.");

        menu.aggiungiPortata(patateAlForno);
        menu.aggiungiPortata(verdureGrigliate);
        menu.aggiungiPortata(insalataMista);
        menu.aggiungiPortata(caponata);

        //Dessert
        Portata sorbettoAlLimone = new Dessert("Sorbetto al limone", 5.00, "Coppa di sorbetto con limoni freschi di Siracusa igp", 250, List.of(AllergeniEnum.LATTE, AllergeniEnum.UOVA),"Il Principe",20.00);
        Portata tiramisu= new Dessert("Tiramisù", 6.00, "Fetta di tiramisù con mascarpone, savoiardi,caffè e amaretto di Saronno", 350, List.of(AllergeniEnum.LATTE,AllergeniEnum.UOVA),"Sal De Riso",25.00);
        Portata pannaCotta = new Dessert("Panna Cotta", 4.50, "Panna cotta con succo di fragole fresche frullate", 400, List.of(),"La Dalmasso",10.00);
        Portata cheesecake = new Dessert("Cheescake al Pistacchio", 8.90, "Fetta di Cheescake al pistacchio di Bronte con base di biscotti", 650, List.of(AllergeniEnum.LATTE,AllergeniEnum.UOVA),"Maison Manilia",5.00);


        menu.aggiungiPortata(sorbettoAlLimone);
        menu.aggiungiPortata(tiramisu);
        menu.aggiungiPortata(pannaCotta);
        menu.aggiungiPortata(cheesecake);

        //Bevande
        Portata acquaNaturale = new Bevanda("Acqua naturale", 3.00, "1l", 0, List.of(), null);
        Portata acquaFrizzante = new Bevanda("Acqua frizzante", 3.00, "1l", 0, List.of(), null);
        Portata cocaCola = new Bevanda("Coca Cola", 3.5, "lattina 33cl", 120, List.of(), null);
        Portata sprite = new Bevanda("Sprite", 3.5, "lattina 33cl", 135, List.of(), null);
        Portata fanta = new Bevanda("Fanta", 3.5, "lattina 33cl", 140,  List.of(), null);
        Portata theLimone = new Bevanda("Thé al limone", 3.5, "lattina 33cl", 85, List.of(), null);
        Portata birraPiccola = new Bevanda("Birra piccola alla spina", 4.00, "Franziskainer 25cl", 120, List.of(), 5.00);
        Portata birraMedia = new Bevanda("Birra media alla spina", 6.00, "Franziskainer 40cl", 100 , List.of(), 5.00);
        Portata caliceVino = new Bevanda("Calice di vino", 5.50, "Montepulciano D'Abruzzo 2018", 110,  List.of(), 12.00);

        menu.aggiungiPortata(acquaNaturale);
        menu.aggiungiPortata(acquaFrizzante);
        menu.aggiungiPortata(cocaCola);
        menu.aggiungiPortata(sprite);
        menu.aggiungiPortata(fanta);
        menu.aggiungiPortata(theLimone);
        menu.aggiungiPortata(birraPiccola);
        menu.aggiungiPortata(birraMedia);
        menu.aggiungiPortata(caliceVino);

        // Stampa tutte le portate del menu
        menu.stampaPortate();

        // parte di connessione al DB
        MenuDao menuDao = new MenuDao();
        PortataDao portataDao = new PortataDao();

        try {
            Integer menu1Id = menuDao.insertMenuAndGetMenuId(menu);

            //CONTROLLARE INSERIMENTO
            polentinaConcia.setIdMenu(menu1Id);
            Integer idPortataPolentinaConcia = portataDao.insertPortataAndGetPortataId(polentinaConcia);
            polentinaConcia.setIdPortata(idPortataPolentinaConcia);
            portataDao.insertAntipasto(polentinaConcia);


        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}



