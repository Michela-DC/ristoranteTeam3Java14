import java.util.List;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu("RISTORANTE GLI ORSI BRUNI", "Contemporary and classic italian cuisine");

        // Primi Piatti
        // List.of() lo usiamo per creare una lista di allergeni che prendiamo da AllergeniEnum
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
        Portata acquaNaturale = new Bevanda("Acqua naturale", 3.00, "1l", List.of());
        Portata acquaFrizzante = new Bevanda("Acqua frizzante", 3.00, "1l", List.of());
        Portata cocaCola = new Bevanda("Coca Cola", 3.5, "lattina 33cl", List.of());
        Portata sprite = new Bevanda("Sprite", 3.5, "lattina 33cl", List.of());
        Portata fanta = new Bevanda("Fanta", 3.5, "lattina 33cl", List.of());
        Portata theLimone = new Bevanda("Thé al limone", 3.5, "lattina 33cl", List.of());
        Portata birraPiccola = new Bevanda("Birra piccola", 4.00, "25cl, Alc %5,00", List.of());
        Portata birraMedia = new Bevanda("Birra media", 6.00, "40cl, Alc %5,00", List.of());
        Portata caliceVino = new Bevanda("Calice di vino", 5.50, "Alc %12,00", List.of());

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



