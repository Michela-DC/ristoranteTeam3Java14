public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu("RISTORANTE GLI ORSI BRUNI", "Contemporary and classic italian cuisine");

        Portata spaghettiAllaCarbonara = new PrimoPiatto("Spaghetti alla carbonara" , 10.50,"Spaghetti conditi con uova, pancetta, pecorino romano e pepe nero");
        Portata risottoAiFunghi = new PrimoPiatto("Risotto ai funghi" , 12.50,"Risotto cremoso preparato con funghi porcini freschi e parmigiano reggiano");
        Portata lasagneAlRagu = new PrimoPiatto("Lasagne al ragù" , 12.00,"Strati di pasta all'uovo, ragù di carne, besciamella e formaggio gratinato");
        Portata penneAllArrabbiata = new PrimoPiatto("Penne all'arrabbiata" , 9.00,"Penne condite con salsa piccante al pomodoro, aglio, peperoncino e prezzemolo");
        Portata gnocchiAlPesto = new PrimoPiatto("Gnocchi al pesto" , 8.50,"Gnocchi di patate freschi serviti con salsa al basilico, pinoli, parmigiano e olio d'oliva");

        menu.aggiungiPortata(spaghettiAllaCarbonara);
        menu.aggiungiPortata(risottoAiFunghi);
        menu.aggiungiPortata(lasagneAlRagu);
        menu.aggiungiPortata(penneAllArrabbiata);
        menu.aggiungiPortata(gnocchiAlPesto);

        Portata scaloppineAlLimone = new SecondoPiatto("Scaloppine al limone", 12.00, "Fettine di vitello  battute e poi cotte in padella con succo di limone, burro e prezzemolo");
        Portata arrostoDiMaiale = new SecondoPiatto("Arrosto di maiale", 14.00, "Arrosto di delizioso filetto di maialino nero");
        Portata bisteccaAllaFiorentina = new SecondoPiatto("Bistecca alla fiorentina", 24.00, "Bistecca di carne marchigiana con taglio da fiorentina");
        Portata abbacchioAllaRomana = new SecondoPiatto("Abbacchio alla romana", 16.00, "Carne di agnello da latte marinata con aglio, rosmarino, pepe nero e succo di limone cotta lentamente in padella");
        Portata polloAllaCacciatora = new SecondoPiatto("Pollo alla cacciatora", 14.00, "Pollo allevato a terra con  contorno di patate al forno");

        menu.aggiungiPortata(scaloppineAlLimone);
        menu.aggiungiPortata(arrostoDiMaiale);
        menu.aggiungiPortata(bisteccaAllaFiorentina);
        menu.aggiungiPortata(abbacchioAllaRomana);
        menu.aggiungiPortata(polloAllaCacciatora);

        Portata sorbettoAlLimone = new Dessert("Sorbetto al limone", 5.00, "Coppa di sorbetto con limoni freschi di Siracusa igp");
        Portata tiramisu= new Dessert("Tiramisù", 6.00, "Fetta di tiramisù con mascarpone, savoiardi,caffè e amaretto di Saronno");
        Portata pannaCotta = new Dessert("Panna Cotta", 4.50, "Panna cotta con succo di fragole fresche frullate");
        Portata cheesecake = new Dessert("Cheescake al Pistacchio", 8.90, "Fetta di Cheescake al pistacchio di Bronte con base di biscotti");

        menu.aggiungiPortata(sorbettoAlLimone);
        menu.aggiungiPortata(tiramisu);
        menu.aggiungiPortata(pannaCotta);
        menu.aggiungiPortata(cheesecake);

        Portata acquaNaturale = new Bevanda("Acqua naturale", 3.00, "1l");
        Portata acquaFrizzante = new Bevanda("Acqua frizzante", 3.00, "1l");
        Portata cocaCola = new Bevanda("Coca Cola", 3.5, "lattina 33cl");
        Portata sprite = new Bevanda("Sprite", 3.5, "lattina 33cl");
        Portata fanta = new Bevanda("Fanta", 3.5, "lattina 33cl");
        Portata theLimone = new Bevanda("Thé al limone", 3.5, "lattina 33cl");
        Portata birraPiccola = new Bevanda("Birra piccola", 4.00, "25cl, Alc %5,00");
        Portata birraMedia = new Bevanda("Birra media", 6.00, "40cl, Alc %5,00");
        Portata caliceVino = new Bevanda("Calice di vino", 5.50, "Alc %12,00");

        menu.aggiungiPortata(acquaNaturale);
        menu.aggiungiPortata(acquaFrizzante);
        menu.aggiungiPortata(cocaCola);
        menu.aggiungiPortata(sprite);
        menu.aggiungiPortata(fanta);
        menu.aggiungiPortata(theLimone);
        menu.aggiungiPortata(birraPiccola);
        menu.aggiungiPortata(birraMedia);
        menu.aggiungiPortata(caliceVino);

        menu.stampaPortate();
    }
}


