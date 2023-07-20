public class Main {
    public static void main(String[] args) {

        //TODO spostare in menu
        System.out.println("RISTORANTE GLI ORSI BRUNI");
        System.out.println("Contemporary and classic italian cuisine");
        System.out.println("\n");

        Menu menu = new Menu();

        PrimoPiatto spaghettiAllaCarbonara = new PrimoPiatto("Spaghetti alla carbonara" , 10.50,"Spaghetti conditi con uova, pancetta, pecorino romano e pepe nero");
        PrimoPiatto risottoAiFunghi = new PrimoPiatto("Risotto ai funghi" , 12.50,"Risotto cremoso preparato con funghi porcini freschi e parmigiano reggiano");
        PrimoPiatto lasagneAlRagu = new PrimoPiatto("Lasagne al ragù" , 12.00,"Strati di pasta all'uovo, ragù di carne, besciamella e formaggio gratinato");
        PrimoPiatto penneAllArrabbiata = new PrimoPiatto("Penne all'arrabbiata" , 9.00,"Penne condite con salsa piccante al pomodoro, aglio, peperoncino e prezzemolo");
        PrimoPiatto gnocchiAlPesto = new PrimoPiatto("Gnocchi al pesto" , 8.50,"Gnocchi di patate freschi serviti con salsa al basilico, pinoli, parmigiano e olio d'oliva");

        menu.aggiungiPrimoPiatto(spaghettiAllaCarbonara);
        menu.aggiungiPrimoPiatto(risottoAiFunghi);
        menu.aggiungiPrimoPiatto(lasagneAlRagu);
        menu.aggiungiPrimoPiatto(penneAllArrabbiata);
        menu.aggiungiPrimoPiatto(gnocchiAlPesto);

        SecondoPiatto scaloppineAlLimone = new SecondoPiatto("Scaloppine al limone", 12, "Fettine di vitello  battute e poi cotte in padella con succo di limone, burro e prezzemolo");
        SecondoPiatto arrostoDiMaiale = new SecondoPiatto("Arrosto di maiale", 14, "Arrosto di delizioso filetto di maialino nero");
        SecondoPiatto bisteccaAllaFiorentina = new SecondoPiatto("Bistecca alla fiorentina", 24, "Bistecca di carne marchigiana con taglio da fiorentina");
        SecondoPiatto abbacchioAllaRomana = new SecondoPiatto("Abbacchio alla romana", 16, "Carne di agnello da latte marinata con aglio, rosmarino, pepe nero e succo di limone cotta lentamente in padella");
        SecondoPiatto polloAllaCacciatora = new SecondoPiatto("Pollo alla cacciatora", 14, "Pollo allevato a terra con  contorno di patate al forno");

        menu.aggiungiSecondoPiatto(scaloppineAlLimone);
        menu.aggiungiSecondoPiatto(arrostoDiMaiale);
        menu.aggiungiSecondoPiatto(bisteccaAllaFiorentina);
        menu.aggiungiSecondoPiatto(abbacchioAllaRomana);
        menu.aggiungiSecondoPiatto(polloAllaCacciatora);

        Dessert sorbettoAlLimone = new Dessert("Sorbetto al limone", 5, "Coppa di sorbetto con limoni freschi di Siracusa igp");
        Dessert tiramisu= new Dessert("Tiramisù", 6, "Fetta di tiramisù con mascarpone, savoiardi,caffè e amaretto di Saronno");
        Dessert pannaCotta = new Dessert("Panna Cotta", 4.50, "Panna cotta con succo di fragole fresche frullate");
        Dessert cheescake = new Dessert("Cheescake al Pistacchio", 8.90, "Fetta di Cheescake al pistacchio di Bronte con base di biscotti");

        menu.aggiungiDessert(sorbettoAlLimone);
        menu.aggiungiDessert(tiramisu);
        menu.aggiungiDessert(pannaCotta);
        menu.aggiungiDessert(cheescake);

        Portata acquaNaturale = new Bevanda("Acqua naturale", 3, "1l");
        Bevanda acquaFrizzante = new Bevanda("Acqua frizzante", 3, "1l");
        Bevanda cocaCola = new Bevanda("Coca Cola", 3.5, "lattina 33cl");
        Bevanda sprite = new Bevanda("Sprite", 3.5, "lattina 33cl");
        Bevanda fanta = new Bevanda("Fanta", 3.5, "lattina 33cl");
        Bevanda theLimone = new Bevanda("Thé al limone", 3.5, "lattina 33cl");
        Bevanda birraPiccola = new Bevanda("Birra piccola", 4, "25cl, Alc %5,00");
        Bevanda birraMedia = new Bevanda("Birra media", 6, "40cl, Alc %5,00");
        Bevanda caliceVino = new Bevanda("Calice di vino", 5.50, "Alc %12,00");

        menu.aggiungiBevanda(acquaNaturale);
        menu.aggiungiBevanda(acquaFrizzante);
        menu.aggiungiBevanda(cocaCola);
        menu.aggiungiBevanda(sprite);
        menu.aggiungiBevanda(fanta);
        menu.aggiungiBevanda(theLimone);
        menu.aggiungiBevanda(birraPiccola);
        menu.aggiungiBevanda(birraMedia);
        menu.aggiungiBevanda(caliceVino);

        //TODO spostare in un solo metodo
        menu.stampaPrimiPiatti();
        System.out.println("\n");
        menu.stampaSecondiPiatti();
        System.out.println("\n");
        menu.stampaDessert();
        System.out.println("\n");
        menu.stampaBevande();

    }
}
