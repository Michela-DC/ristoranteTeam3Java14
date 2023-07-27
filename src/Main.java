import java.util.List;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu("RISTORANTE GLI ORSI BRUNI", "Contemporary and classic italian cuisine");

        // Primi Piatti
        // List.of() lo usiamo per creare una lista di allergeni che prendiamo da AllergeniEnum
        Portata polentinaConcia = new Antipasti("Polentina Concia" , 6.50 , "Polenta morbida al burro e fontina con sbriciolata di prosciutto crudo essicato", List.of(AllergeniEnum.LATTE.getDescrizione()));
        Portata tartareDiManzo = new Antipasti("Tartare di manzo" , 10.50 , "Con cremoso al pecorino, funghi pleius scottati e polvere di porcino essiccato", List.of(AllergeniEnum.LATTE.getDescrizione()));
        Portata iNostriSpiedini = new Antipasti("I nostri spiedini" , 9.50 , "Spiedini di manzo con crema delicata all’aglio e mentuccia, spiedini di maiale , spiedini di vitello con salsa teriyaki e granella di pistacchio", List.of());
        Portata bresaolaRucolaParmigiano = new Antipasti("Bresaola con rucola e parmigiano" , 8.50 , "Sottili fette di carne di manzo essiccata servite con rucola e scaglie di parmigiano", List.of(AllergeniEnum.LATTE.getDescrizione()));
        Portata salumiMisti = new Antipasti("Tagliere di salumi misti" , 12.50 , "Un assortimento di salumi come prosciutto, salame, coppa, bresaola e mortadella", List.of());

        menu.aggiungiPortata(polentinaConcia);
        menu.aggiungiPortata(tartareDiManzo);
        menu.aggiungiPortata(iNostriSpiedini);
        menu.aggiungiPortata(bresaolaRucolaParmigiano);
        menu.aggiungiPortata(salumiMisti);

        Portata spaghettiAllaCarbonara = new PrimoPiatto("Spaghetti alla carbonara" , 10.50,"Spaghetti conditi con uova, pancetta, pecorino romano e pepe nero", List.of(AllergeniEnum.GLUTINE.getDescrizione(), AllergeniEnum.UOVA.getDescrizione()));
        Portata risottoAiFunghiESalsiccia = new PrimoPiatto("Risotto ai funghi e salsiccia" , 12.50,"Risotto cremoso preparato con funghi porcini freschi e parmigiano reggiano", List.of(AllergeniEnum.LATTE.getDescrizione()));
        Portata lasagneAlRagu = new PrimoPiatto("Lasagne al ragù" , 12.00,"Strati di pasta all'uovo, ragù di carne, besciamella e formaggio gratinato", List.of(AllergeniEnum.GLUTINE.getDescrizione())) ;
        Portata penneAllArrabbiata = new PrimoPiatto("Penne all'arrabbiata" , 9.00,"Penne condite con salsa piccante al pomodoro, aglio, peperoncino e prezzemolo", List.of(AllergeniEnum.GLUTINE.getDescrizione()));
        Portata pappardelleAlCinghiale = new PrimoPiatto("Pappardelle al cinghiale" , 9.50,"Gnocchi di patate freschi serviti con salsa al basilico, pinoli, parmigiano e olio d'oliva", List.of(AllergeniEnum.GLUTINE.getDescrizione(), AllergeniEnum.LATTE.getDescrizione(), AllergeniEnum.FRUTTA_A_GUSCIO.getDescrizione()));

        menu.aggiungiPortata(spaghettiAllaCarbonara);
        menu.aggiungiPortata(risottoAiFunghiESalsiccia);
        menu.aggiungiPortata(lasagneAlRagu);
        menu.aggiungiPortata(penneAllArrabbiata);
        menu.aggiungiPortata(pappardelleAlCinghiale);

        // Secondi
        Portata scaloppineAlLimone = new SecondoPiatto("Scaloppine al limone", 12.00, "Fettine di vitello  battute e poi cotte in padella con succo di limone, burro e prezzemolo", List.of());
        Portata arrostoDiMaiale = new SecondoPiatto("Arrosto di maiale", 14.00, "Arrosto di delizioso filetto di maialino nero", List.of());
        Portata bisteccaAllaFiorentina = new SecondoPiatto("Bistecca alla fiorentina", 24.00, "Bistecca di carne marchigiana con taglio da fiorentina", List.of());
        Portata abbacchioAllaRomana = new SecondoPiatto("Abbacchio alla romana", 16.00, "Carne di agnello da latte marinata con aglio, rosmarino, pepe nero e succo di limone cotta lentamente in padella", List.of());
        Portata polloAllaCacciatora = new SecondoPiatto("Pollo alla cacciatora", 14.00, "Pollo allevato a terra con  contorno di patate al forno", List.of());

        menu.aggiungiPortata(scaloppineAlLimone);
        menu.aggiungiPortata(arrostoDiMaiale);
        menu.aggiungiPortata(bisteccaAllaFiorentina);
        menu.aggiungiPortata(abbacchioAllaRomana);
        menu.aggiungiPortata(polloAllaCacciatora);

        //Contorni
        Portata patateAlForno = new Contorno("Patate al forno", 7.00, "Patate cotte al forno con olio e rosmarino", List.of());
        Portata verdureGrigliate = new Contorno("Verdure grigliate", 7.20, "Melanzane, zucchine, peperoni, marinate in olio, sale, pepe, aglio e prezzemolo", List.of());
        Portata insalataMista = new Contorno("insalata mista", 6.80, "Lattuga, pomodorini, carote, uova", List.of(AllergeniEnum.UOVA.getDescrizione()));
        Portata caponata = new Contorno("Caponata", 7.50, "Melanzane, zucchine, cipolla, polpa di pomodoro, sale, olio, pepe, aceto di vino bianco, zucchero", List.of());

        menu.aggiungiPortata(patateAlForno);
        menu.aggiungiPortata(verdureGrigliate);
        menu.aggiungiPortata(insalataMista);
        menu.aggiungiPortata(caponata);

        // Dessert
        Portata sorbettoAlLimone = new Dessert("Sorbetto al limone", 5.00, "Coppa di sorbetto con limoni freschi di Siracusa igp",List.of(AllergeniEnum.LATTE.getDescrizione(), AllergeniEnum.UOVA.getDescrizione()));
        Portata tiramisu= new Dessert("Tiramisù", 6.00, "Fetta di tiramisù con mascarpone, savoiardi,caffè e amaretto di Saronno",List.of(AllergeniEnum.LATTE.getDescrizione(),AllergeniEnum.UOVA.getDescrizione()));
        Portata pannaCotta = new Dessert("Panna Cotta", 4.50, "Panna cotta con succo di fragole fresche frullate",List.of());
        Portata cheesecake = new Dessert("Cheescake al Pistacchio", 8.90, "Fetta di Cheescake al pistacchio di Bronte con base di biscotti",List.of(AllergeniEnum.LATTE.getDescrizione(),AllergeniEnum.UOVA.getDescrizione()));

        menu.aggiungiPortata(sorbettoAlLimone);
        menu.aggiungiPortata(tiramisu);
        menu.aggiungiPortata(pannaCotta);
        menu.aggiungiPortata(cheesecake);

        // Bevande
        Portata acquaNaturale = new Bevanda("Acqua naturale", 3.00, "1l", null, List.of());
        Portata acquaFrizzante = new Bevanda("Acqua frizzante", 3.00, "1l", null, List.of());
        Portata cocaCola = new Bevanda("Coca Cola", 3.5, "lattina 33cl", null, List.of());
        Portata sprite = new Bevanda("Sprite", 3.5, "lattina 33cl", null, List.of());
        Portata fanta = new Bevanda("Fanta", 3.5, "lattina 33cl", null, List.of());
        Portata theLimone = new Bevanda("Thé al limone", 3.5, "lattina 33cl", null, List.of());
        Portata birraPiccola = new Bevanda("Birra piccola alla spina", 4.00, "Franziskainer 25cl", 5.00, List.of());
        Portata birraMedia = new Bevanda("Birra media alla spina", 6.00, "Franziskainer 40cl", 5.00, List.of());
        Portata caliceVino = new Bevanda("Calice di vino", 5.50, "Montepulciano D'Abruzzo 2018", 12.00, List.of());

        menu.aggiungiPortata(acquaNaturale);
        menu.aggiungiPortata(acquaFrizzante);
        menu.aggiungiPortata(cocaCola);
        menu.aggiungiPortata(sprite);
        menu.aggiungiPortata(fanta);
        menu.aggiungiPortata(theLimone);
        menu.aggiungiPortata(birraPiccola);
        menu.aggiungiPortata(birraMedia);
        menu.aggiungiPortata(caliceVino);



        // Stampa di tutte le portate del menu
        menu.stampaPortate();
    }
}



