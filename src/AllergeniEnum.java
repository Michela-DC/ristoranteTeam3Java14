public enum AllergeniEnum {
    FRUTTA_A_GUSCIO("frutta a guscio"),
    LATTE("latte"),
    UOVA("uova"),
    GLUTINE("glutine"),
    SOIA("soia"),
    MOLLUSCHI("molluschi"),
    PESCE("pesce"),
    CROSTACEI("crostacei");


    private  String descrizione;

    AllergeniEnum(String descrizione){

        this.descrizione = descrizione;

    }

    public String getDescrizione() {
        return descrizione;
    }
}



